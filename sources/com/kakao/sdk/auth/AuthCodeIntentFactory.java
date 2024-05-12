package com.kakao.sdk.auth;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AuthCodeIntentFactory {
    public static final AuthCodeIntentFactory INSTANCE = new AuthCodeIntentFactory();

    public final Intent talkBase() {
        Intent addCategory = new Intent("com.kakao.talk.intent.action.CAPRI_LOGGED_IN_ACTIVITY").addCategory("android.intent.category.DEFAULT");
        o.LJIIIIZZ(addCategory, "Intent(Constants.CAPRI_LOGGED_IN_ACTIVITY).addCategory(Intent.CATEGORY_DEFAULT)");
        return addCategory;
    }

    public final Intent account(Context context, Uri fullUri, String redirectUri, ResultReceiver resultReceiver) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(fullUri, "fullUri");
        o.LJIIIZ(redirectUri, "redirectUri");
        o.LJIIIZ(resultReceiver, "resultReceiver");
        Intent intent = new Intent(context, (Class<?>) AuthCodeHandlerActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("key.result.receiver", resultReceiver);
        bundle.putParcelable("key.full_authorize_uri", fullUri);
        bundle.putString("key.redirect_uri", redirectUri);
        Intent addFlags = intent.putExtra("key.bundle", bundle).addFlags(268435456);
        o.LJIIIIZZ(addFlags, "Intent(context, AuthCodeHandlerActivity::class.java)\n            .putExtra(Constants.KEY_BUNDLE, Bundle().apply {\n                putParcelable(Constants.KEY_RESULT_RECEIVER, resultReceiver)\n                putParcelable(Constants.KEY_FULL_URI, fullUri)\n                putString(Constants.KEY_REDIRECT_URI, redirectUri)\n            })\n            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)");
        return addFlags;
    }

    public final Intent talk(Context context, int i, String clientId, String redirectUri, String kaHeader, Bundle extras, ResultReceiver resultReceiver) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(clientId, "clientId");
        o.LJIIIZ(redirectUri, "redirectUri");
        o.LJIIIZ(kaHeader, "kaHeader");
        o.LJIIIZ(extras, "extras");
        o.LJIIIZ(resultReceiver, "resultReceiver");
        Intent intent = new Intent(context, (Class<?>) TalkAuthCodeActivity.class);
        Intent talkBase = talkBase();
        Constants constants = Constants.INSTANCE;
        Intent putExtra = intent.putExtra("key.login.intent", talkBase.putExtra(constants.getEXTRA_APPLICATION_KEY(), clientId).putExtra(constants.getEXTRA_REDIRECT_URI(), redirectUri).putExtra(constants.getEXTRA_KA_HEADER(), kaHeader).putExtra(constants.getEXTRA_EXTRAPARAMS(), extras)).putExtra("key.request.code", i);
        Bundle bundle = new Bundle();
        bundle.putParcelable("key.result.receiver", resultReceiver);
        Intent putExtra2 = putExtra.putExtra("key.bundle", bundle);
        o.LJIIIIZZ(putExtra2, "Intent(context, TalkAuthCodeActivity::class.java)\n            .putExtra(\n                Constants.KEY_LOGIN_INTENT,\n                talkBase()\n                    .putExtra(Constants.EXTRA_APPLICATION_KEY, clientId)\n                    .putExtra(Constants.EXTRA_REDIRECT_URI, redirectUri)\n                    .putExtra(Constants.EXTRA_KA_HEADER, kaHeader)\n                    .putExtra(Constants.EXTRA_EXTRAPARAMS, extras)\n            )\n            .putExtra(Constants.KEY_REQUEST_CODE, requestCode)\n            .putExtra(Constants.KEY_BUNDLE, Bundle().apply {\n                putParcelable(Constants.KEY_RESULT_RECEIVER, resultReceiver)\n            })");
        return putExtra2;
    }
}
