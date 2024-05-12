package X;

import Y.ACallableS112S0100000_9;
import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.push.PushBody;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.innerpush.api.model.PassThroughMessage;
import com.ss.android.ugc.aweme.innerpush.model.PushWrapper;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import ujb.o;

/* renamed from: X.MgB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57419MgB {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C57130MbW.LJLIL);

    static {
        C221108m2.LIZIZ(C57420MgC.LJLIL);
    }

    public static final ViewGroup LJ(Activity activity) {
        Fragment fragment;
        View view;
        DialogFragment dialogFragment;
        Dialog dialog;
        Window window;
        ActivityC45651qj activityC45651qj;
        FragmentManager supportFragmentManager;
        List<Fragment> LJJJJLI;
        Fragment fragment2;
        if ((activity instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) activity) != null && (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) != null && (LJJJJLI = supportFragmentManager.LJJJJLI()) != null) {
            Iterator<Fragment> it = LJJJJLI.iterator();
            while (true) {
                if (it.hasNext()) {
                    fragment2 = it.next();
                    Fragment fragment3 = fragment2;
                    if ((fragment3 instanceof DialogFragment) && fragment3.isVisible()) {
                        break;
                    }
                } else {
                    fragment2 = null;
                    break;
                }
            }
            fragment = fragment2;
        } else {
            fragment = null;
        }
        if (!(fragment instanceof DialogFragment) || (dialogFragment = (DialogFragment) fragment) == null || (dialog = dialogFragment.getDialog()) == null || (window = dialog.getWindow()) == null || (view = window.getDecorView()) == null) {
            Window window2 = activity.getWindow();
            if (window2 != null) {
                view = window2.getDecorView();
            } else {
                view = null;
            }
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) view;
    }

    public static final boolean LJFF(String str) {
        if (str == null || str.length() == 0 || !o.LJJJLIIL(str, "{", false) || !o.LJJJJ(str, "}", false)) {
            return false;
        }
        try {
            new JSONObject(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final void LJI(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
            interfaceC65784Pro.invoke();
        } else {
            kotlin.jvm.internal.o.LJIIIIZZ(C10K.LIZIZ(new ACallableS112S0100000_9(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 18), C10K.LJIIIIZZ, null), "block: () -> Unit): Task… Task.UI_THREAD_EXECUTOR)");
        }
    }

    public static final C10K<C76800UCe> LJIIIZ(InterfaceC65784Pro<C76800UCe> block) {
        kotlin.jvm.internal.o.LJIIIZ(block, "block");
        C10K<C76800UCe> LIZIZ = C10K.LIZIZ(new ACallableS112S0100000_9(block, (InterfaceC65784Pro<C76800UCe>) 16), (Executor) MS5.LIZ.getValue(), null);
        kotlin.jvm.internal.o.LJI(LIZIZ);
        return LIZIZ;
    }

    public static final void LIZ(CopyOnWriteArraySet copyOnWriteArraySet, String str) {
        if (C78857UxB.LJJJIL(str)) {
            copyOnWriteArraySet.add(str);
        }
    }

    public static final void LIZIZ(InnerPushMessage innerPushMessage, String str) {
        if (str == null || str.length() == 0 || kotlin.jvm.internal.o.LJ(str, "null") || innerPushMessage.getProtocol() != 2) {
            return;
        }
        innerPushMessage.setPayload((Serializable) JsonParseUtils.LIZJ(PassThroughMessage.class, str));
    }

    public static final void LIZJ(InnerPushMessage innerPushMessage, PushBody pushBody) {
        InnerPushUITemplate uiTemplate;
        if (innerPushMessage.getConvertFromExternal() && (uiTemplate = innerPushMessage.getUiTemplate()) != null) {
            String title = uiTemplate.getTitle();
            if (title == null || title.length() == 0) {
                uiTemplate.setTitle(pushBody.title);
            }
            String content = uiTemplate.getContent();
            if (content == null || content.length() == 0) {
                uiTemplate.setContent(pushBody.text);
            }
            List<String> avatarUrls = uiTemplate.getAvatarUrls();
            if (avatarUrls == null || avatarUrls.isEmpty()) {
                uiTemplate.setAvatarUrls(C47261Igj.LJJIJ(pushBody.imageUrl));
            }
            String globalSchemaUrl = uiTemplate.getGlobalSchemaUrl();
            if (globalSchemaUrl == null || globalSchemaUrl.length() == 0) {
                uiTemplate.setGlobalSchemaUrl(pushBody.open_url);
            }
        }
    }

    public static final void LIZLLL(InnerPushMessage innerPushMessage, PushWrapper pushWrapper) {
        InnerPushUITemplate uiTemplate;
        if (innerPushMessage.getConvertFromExternal() && (uiTemplate = innerPushMessage.getUiTemplate()) != null) {
            String title = uiTemplate.getTitle();
            if (title == null || title.length() == 0) {
                uiTemplate.setTitle(pushWrapper.getTitle());
            }
            String content = uiTemplate.getContent();
            if (content == null || content.length() == 0) {
                uiTemplate.setContent(pushWrapper.getContent());
            }
            List<String> avatarUrls = uiTemplate.getAvatarUrls();
            if (avatarUrls == null || avatarUrls.isEmpty()) {
                uiTemplate.setAvatarUrls(C47261Igj.LJJIJ(pushWrapper.getImageUrl()));
            }
            String globalSchemaUrl = uiTemplate.getGlobalSchemaUrl();
            if (globalSchemaUrl == null || globalSchemaUrl.length() == 0) {
                uiTemplate.setGlobalSchemaUrl(pushWrapper.getOpenUrl());
            }
        }
    }

    public static final void LJII(SmartRoute smartRoute, InnerPushMessage innerPushMessage) {
        InnerPushUITemplate uiTemplate;
        List<String> avatarUrls;
        String str;
        String str2;
        List<String> avatarUrls2;
        if (innerPushMessage == null) {
            return;
        }
        if ((innerPushMessage.getType() == 3 || innerPushMessage.getType() == 4 || innerPushMessage.getType() == 6) && (uiTemplate = innerPushMessage.getUiTemplate()) != null && (avatarUrls = uiTemplate.getAvatarUrls()) != null && avatarUrls.size() == 1) {
            InnerPushUITemplate uiTemplate2 = innerPushMessage.getUiTemplate();
            Object obj = null;
            if (uiTemplate2 != null && (avatarUrls2 = uiTemplate2.getAvatarUrls()) != null) {
                str = (String) ListProtector.get(avatarUrls2, 0);
            } else {
                str = null;
            }
            smartRoute.withParam("expose_avatar_url", str);
            InnerPushUITemplate uiTemplate3 = innerPushMessage.getUiTemplate();
            if (uiTemplate3 != null) {
                str2 = uiTemplate3.getTitle();
            } else {
                str2 = null;
            }
            smartRoute.withParam("expose_username", str2);
            HashMap hashMap = new HashMap();
            try {
                String bizExtraJsonStr = innerPushMessage.getBizExtraJsonStr();
                if (bizExtraJsonStr != null) {
                    JSONObject jSONObject = new JSONObject(bizExtraJsonStr);
                    Iterator<String> keys = jSONObject.keys();
                    kotlin.jvm.internal.o.LJIIIIZZ(keys, "json.keys()");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String optString = jSONObject.optString(next);
                        kotlin.jvm.internal.o.LJIIIIZZ(optString, "json.optString(key)");
                        hashMap.put(next, optString);
                    }
                    obj = C76800UCe.LIZ;
                }
                C3C5.m7constructorimpl(obj);
            } catch (Throwable th) {
                obj = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(obj);
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(obj);
            if (m10exceptionOrNullimpl != null) {
                C86478Xwo.LIZJ("InnerPushMob", "getInnerPushExtraInfoMap error", m10exceptionOrNullimpl);
            }
            String str3 = (String) hashMap.get("raw_comment");
            if (str3 == null) {
                str3 = "";
            }
            smartRoute.withParam("expose_comment_text", str3);
            int type = innerPushMessage.getType();
            if (type != 3) {
                if (type != 4) {
                    if (type != 6) {
                        return;
                    }
                    smartRoute.withParam("expose_type", "MENTION");
                    return;
                }
                smartRoute.withParam("expose_type", "REPLY");
                return;
            }
            smartRoute.withParam("expose_type", "COMMENT");
        }
    }

    public static final InnerPushMessage LJIIIIZZ(String str, boolean z) {
        boolean z2;
        Object opt;
        JSONObject jSONObject;
        String obj;
        Object LIZ2;
        if (str == null || str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || !LJFF(str) || (opt = new JSONObject(str).opt("social_inapp_push")) == null) {
            return null;
        }
        if ((opt instanceof String) && ((CharSequence) opt).length() > 0 && !kotlin.jvm.internal.o.LJ(opt, "null")) {
            obj = (String) opt;
            jSONObject = new JSONObject(obj);
        } else {
            if (opt instanceof JSONObject) {
                jSONObject = (JSONObject) opt;
                obj = opt.toString();
            }
            return null;
        }
        InnerPushMessage innerPushMessage = (InnerPushMessage) C75792yF.LIZ(obj, InnerPushMessage.class);
        if (z && innerPushMessage != null) {
            try {
                if (innerPushMessage.getProtocol() >= 2) {
                    LIZIZ(innerPushMessage, jSONObject.optString("payload"));
                }
                LIZ2 = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ2);
            } catch (Throwable th) {
                LIZ2 = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ2);
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
            if (m10exceptionOrNullimpl != null) {
                C86478Xwo.LIZJ("InnerPushMessage", "applyPayload from innerJson error", m10exceptionOrNullimpl);
            }
        }
        return innerPushMessage;
    }
}
