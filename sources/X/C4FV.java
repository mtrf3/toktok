package X;

import android.os.SystemClock;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GifContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model.ActionBarButtonConf;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model.ActionBarConf;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.4FV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FV {
    public static final /* synthetic */ int LIZ = 0;

    public static C106284Fc LIZ(C109544Rq c109544Rq) {
        boolean z;
        String str;
        String str2;
        C106264Fa next;
        List<ActionBarButtonConf> actionBarButtonConf;
        boolean z2 = true;
        if (C106324Fg.LIZ != null) {
            z = true;
        } else {
            z = false;
        }
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C77800Ug8.LIZ(LIZ2, "onEventV3");
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ3.put("is_ambient_anim_res_exist", str);
        LIZ2.LIZIZ("check_ambient_animation_res", LIZ3);
        if (c109544Rq.getMsgType() == 7) {
            try {
                str2 = ((TextContent) C75792yF.LIZ(c109544Rq.getContent(), TextContent.class)).getText();
            } catch (Throwable unused) {
                str2 = null;
            }
            List<C106264Fa> list = C106324Fg.LIZ;
            if (list == null || list.isEmpty() || str2 == null) {
                return null;
            }
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            List<C106264Fa> list2 = C106324Fg.LIZ;
            if (list2 != null) {
                Iterator<C106264Fa> it = list2.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    long j = next.LJLILLLLZI;
                    if (currentTimeMillis <= next.LJLJI && j <= currentTimeMillis && s.LJJJLZIJ(lowerCase, next.LJLJJI, false)) {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("getMatchedAnimation cost-time: ");
                        LIZ4.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                        LIZ4.append(" , text size: ");
                        LIZ4.append(lowerCase.length());
                        C34B.LIZIZ("KeyWordMatcher", X1D.LIZIZ(LIZ4));
                    }
                }
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("getMatchedAnimation cost-time: ");
            LIZ5.append(elapsedRealtime2 - elapsedRealtime);
            LIZ5.append(" , text size: ");
            LIZ5.append(lowerCase.length());
            C34B.LIZIZ("KeyWordMatcher", X1D.LIZIZ(LIZ5));
            return null;
        }
        if (c109544Rq.getMsgType() == 5 && o.LJ(c109544Rq.getExt().get("a:src"), "action_bar:sticker")) {
            try {
                String valueOf = String.valueOf(((GifContent) C75792yF.LIZ(c109544Rq.getContent(), GifContent.class)).getImageId());
                if (valueOf != null) {
                    try {
                    } catch (Throwable th) {
                        C3C5.m7constructorimpl(C141335gf.LIZ(th));
                    }
                    if (CastIntegerProtector.parseInt(valueOf) > 0) {
                        C3C5.m7constructorimpl(C76800UCe.LIZ);
                        ActionBarConf LIZIZ = C106184Es.LIZIZ();
                        if (LIZIZ != null && (actionBarButtonConf = LIZIZ.getActionBarButtonConf()) != null) {
                            for (ActionBarButtonConf actionBarButtonConf2 : actionBarButtonConf) {
                                String actionSchema = actionBarButtonConf2.getActionSchema();
                                if (actionSchema != null && s.LJJJLZIJ(actionSchema, valueOf, false) && C78857UxB.LJJJIL(actionBarButtonConf2.getResourceName())) {
                                    String resourceName = actionBarButtonConf2.getResourceName();
                                    C34B.LIZIZ("AmbientAnimMatcher", "res name got by sticker id: " + resourceName);
                                    List<C106264Fa> list3 = C106324Fg.LIZ;
                                    if (list3 != null && !list3.isEmpty() && resourceName != null) {
                                        long elapsedRealtime3 = SystemClock.elapsedRealtime();
                                        List<C106264Fa> list4 = C106324Fg.LIZ;
                                        if (list4 != null) {
                                            for (C106264Fa c106264Fa : list4) {
                                                if (o.LJ(resourceName, c106264Fa.LJLJL)) {
                                                    StringBuilder LIZJ = V10.LIZJ("getMatchedAnimation cost-time: ", SystemClock.elapsedRealtime() - elapsedRealtime3, " , resName length: ");
                                                    LIZJ.append(resourceName.length());
                                                    C34B.LIZIZ("KeyWordMatcher", X1D.LIZIZ(LIZJ));
                                                    String LIZIZ2 = C85999Xp5.LIZIZ();
                                                    o.LJIIIIZZ(LIZIZ2, "getAppLocale()");
                                                    String holiday = c106264Fa.LJLIL;
                                                    long j2 = c106264Fa.LJLILLLLZI;
                                                    long j3 = c106264Fa.LJLJI;
                                                    String keyText = c106264Fa.LJLJJI;
                                                    String animationName = c106264Fa.LJLJJLL;
                                                    String resourceVideo = c106264Fa.LJLJL;
                                                    o.LJIIIZ(holiday, "holiday");
                                                    o.LJIIIZ(keyText, "keyText");
                                                    o.LJIIIZ(animationName, "animationName");
                                                    o.LJIIIZ(resourceVideo, "resourceVideo");
                                                    next = new C106264Fa(j2, j3, holiday, keyText, LIZIZ2, animationName, resourceVideo);
                                                }
                                            }
                                        }
                                        long elapsedRealtime4 = SystemClock.elapsedRealtime();
                                        StringBuilder LIZ6 = X1D.LIZ();
                                        LIZ6.append("getMatchedAnimation: null, cost-time: ");
                                        LIZ6.append(elapsedRealtime4 - elapsedRealtime3);
                                        LIZ6.append(" , resName length: ");
                                        LIZ6.append(resourceName.length());
                                        C34B.LIZIZ("KeyWordMatcher", X1D.LIZIZ(LIZ6));
                                        return null;
                                    }
                                    return null;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return null;
                }
                return null;
            } catch (Throwable unused2) {
                return null;
            }
        }
        return null;
        if (c109544Rq.getMsgType() != 5) {
            z2 = false;
        }
        return new C106284Fc(next, z2);
    }
}
