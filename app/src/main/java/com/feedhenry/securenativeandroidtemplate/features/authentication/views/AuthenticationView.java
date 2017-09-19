package com.feedhenry.securenativeandroidtemplate.features.authentication.views;

import com.feedhenry.securenativeandroidtemplate.mvp.views.AppView;

import net.openid.appauth.AuthState;
import net.openid.appauth.TokenResponse;

/**
 * Created by weili on 12/09/2017.
 */

public interface AuthenticationView extends AppView {

    public void renderIdentityInfo(AuthState state);

    public void showAuthError(Exception error);
}
