package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CCTemplateInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8s6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224868s6 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(Context context) {
        try {
            C16880lQ.LLLLLLZ(context.getPackageManager(), "com.lemon.lvoverseas", 0);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean LIZJ(Aweme aweme) {
        CCTemplateInfo ccTemplateInfo;
        if (aweme == null || aweme.getAwemeType() == 65 || aweme.getCcTemplateInfo() == null) {
            return false;
        }
        CCTemplateInfo ccTemplateInfo2 = aweme.getCcTemplateInfo();
        String str = null;
        if (ccTemplateInfo2 == null || ccTemplateInfo2.getTemplate_id() == null) {
            return false;
        }
        CCTemplateInfo ccTemplateInfo3 = aweme.getCcTemplateInfo();
        if (ccTemplateInfo3 != null) {
            str = ccTemplateInfo3.getTemplate_id();
        }
        if (o.LJ(str, CardStruct.IStatusCode.DEFAULT) || (ccTemplateInfo = aweme.getCcTemplateInfo()) == null || !ccTemplateInfo.isMatchThePolicy()) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(Aweme aweme) {
        if (aweme != null && aweme.getAwemeType() == 65) {
            return true;
        }
        return false;
    }

    public static void LIZ(Context context, Aweme aweme, String str, String str2) {
        String template_music_id;
        String str3;
        Integer num;
        String template_music_id2;
        String idStr;
        String str4;
        String str5;
        String str6;
        if (context == null || aweme == null) {
            return;
        }
        CCTemplateInfo ccTemplateInfo = aweme.getCcTemplateInfo();
        o.LJIIIIZZ(ccTemplateInfo, "aweme.ccTemplateInfo");
        String str7 = "";
        String str8 = null;
        if (LIZIZ(context)) {
            CCTemplateInfo ccTemplateInfo2 = aweme.getCcTemplateInfo();
            if (LIZJ(aweme)) {
                str4 = "tiktok_music_template_pub";
            } else if (!LIZLLL(aweme)) {
                str4 = "";
            } else {
                str4 = "tiktok_music_template";
            }
            if (LIZJ(aweme)) {
                Music music = aweme.getMusic();
                if (music != null) {
                    str5 = music.getIdStr();
                } else {
                    str5 = null;
                }
            } else if (!LIZLLL(aweme) || ccTemplateInfo2 == null || (str5 = ccTemplateInfo2.getTemplate_music_id()) == null) {
                str5 = "";
            }
            Uri.Builder LIZIZ = C1EU.LIZIZ("capcut://template/detail", "enter_from", str4);
            if (ccTemplateInfo2 == null || (str6 = ccTemplateInfo2.getTemplate_id()) == null) {
                str6 = "";
            }
            Uri.Builder uriBuilder = LIZIZ.appendQueryParameter("template_id", str6).appendQueryParameter("music_id", str5).appendQueryParameter("music_begin_time", Integer.valueOf(aweme.getMusicBeginTime()).toString()).appendQueryParameter("tab_name", "template");
            if (ccTemplateInfo2 != null) {
                o.LJIIIIZZ(uriBuilder, "uriBuilder");
                ccTemplateInfo2.appendQueryParameter(uriBuilder);
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(UriProtector.parse(uriBuilder.toString()));
            intent.putExtra("pns.sandbox.dataflow_id", 1207965953);
            C16880lQ.LIZJ(context, intent);
        } else {
            String onelink = ccTemplateInfo.getOnelink();
            if (onelink != null) {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.addCategory("android.intent.category.BROWSABLE");
                intent2.addCategory("android.intent.category.DEFAULT");
                intent2.setData(UriProtector.parse(onelink));
                intent2.putExtra("pns.sandbox.dataflow_id", 1207967489);
                if (intent2.resolveActivity(context.getPackageManager()) != null) {
                    C16880lQ.LIZJ(context, intent2);
                } else {
                    intent2.setPackage(null);
                    if (intent2.resolveActivity(context.getPackageManager()) != null) {
                        C16880lQ.LIZJ(context, intent2);
                    } else {
                        Activity LJIILL = C78949Uyf.LJIILL(context);
                        if (LJIILL != null) {
                            AnonymousClass114.LIZ(LJIILL, R.string.g20);
                        }
                    }
                }
            }
        }
        if (LIZJ(aweme)) {
            Music music2 = aweme.getMusic();
            if (music2 != null) {
                template_music_id = music2.getIdStr();
            } else {
                template_music_id = null;
            }
        } else {
            template_music_id = ccTemplateInfo.getTemplate_music_id();
        }
        String template_id = ccTemplateInfo.getTemplate_id();
        if (template_id != null && template_music_id != null) {
            C6WH.LIZ(0, template_id, template_music_id);
        }
        C188727au c188727au = new C188727au();
        if (str2 == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("group_id", str2);
        CCTemplateInfo ccTemplateInfo3 = aweme.getCcTemplateInfo();
        if (ccTemplateInfo3 == null || (str3 = ccTemplateInfo3.getTemplate_id()) == null) {
            str3 = "";
        }
        c188727au.LJIIIZ("template_id", str3);
        c188727au.LIZLLL(LIZIZ(context) ? 1 : 0, "is_install_lv");
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("enter_from", str);
        CCTemplateInfo ccTemplateInfo4 = aweme.getCcTemplateInfo();
        if (ccTemplateInfo4 != null) {
            num = Integer.valueOf(ccTemplateInfo4.getTemplateOrder());
        } else {
            num = null;
        }
        c188727au.LJFF(num, "order");
        CCTemplateInfo ccTemplateInfo5 = aweme.getCcTemplateInfo();
        if (ccTemplateInfo5 != null) {
            str8 = ccTemplateInfo5.getMatch_type();
        }
        c188727au.LJIIIZ("match_type", str8);
        if (LIZJ(aweme)) {
            c188727au.LJI("match_item_id", aweme.getAid());
            Music music3 = aweme.getMusic();
            if (music3 != null && (idStr = music3.getIdStr()) != null) {
                str7 = idStr;
            }
            c188727au.LJI("music_id", str7);
        } else {
            CCTemplateInfo ccTemplateInfo6 = aweme.getCcTemplateInfo();
            if (ccTemplateInfo6 != null && (template_music_id2 = ccTemplateInfo6.getTemplate_music_id()) != null) {
                str7 = template_music_id2;
            }
            c188727au.LJI("music_id", str7);
        }
        FMX.LJIIL("cc_music_template_page_click", c188727au.LIZ);
    }
}
