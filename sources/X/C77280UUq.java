package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.FacebookSocialPromptV2flagsSettings;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.UUq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77280UUq {
    public static final /* synthetic */ int LIZ = 0;

    public static CharSequence LIZ(Context context) {
        String string;
        String string2;
        String string3;
        String LIZIZ;
        C116724i4 c116724i4;
        o.LJIIIZ(context, "context");
        if (C52232Kei.LIZ() == 0) {
            String string4 = context.getString(R.string.n1);
            o.LJIIIIZZ(string4, "context.getString(R.string.Facebook_social_prompt)");
            return string4;
        }
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        FacebookSocialPromptV2flagsSettings.FacebookSocialPromptV2flagsModel facebookSocialPromptV2flagsModel = FacebookSocialPromptV2flagsSettings.LIZ;
        FacebookSocialPromptV2flagsSettings.FacebookSocialPromptV2flagsModel facebookSocialPromptV2flagsModel2 = (FacebookSocialPromptV2flagsSettings.FacebookSocialPromptV2flagsModel) LIZLLL.LJIIIIZZ("facebook_social_prompt_v2flags", FacebookSocialPromptV2flagsSettings.FacebookSocialPromptV2flagsModel.class, facebookSocialPromptV2flagsModel);
        if (facebookSocialPromptV2flagsModel2 != null) {
            facebookSocialPromptV2flagsModel = facebookSocialPromptV2flagsModel2;
        }
        if (C52426Khq.LIZ()) {
            string = context.getString(R.string.rx7);
        } else {
            String str = facebookSocialPromptV2flagsModel.promptExcludeTitle;
            if (str == null || str.length() == 0) {
                string = context.getString(R.string.g8b);
            } else {
                string = facebookSocialPromptV2flagsModel.promptExcludeTitle;
            }
        }
        o.LJIIIIZZ(string, "if (Facebook2dRelationEx…          }\n            }");
        String str2 = facebookSocialPromptV2flagsModel.promptExcludeTitle;
        if (str2 == null || str2.length() == 0) {
            string2 = context.getString(R.string.g8h);
        } else {
            string2 = facebookSocialPromptV2flagsModel.learnMoreText;
        }
        o.LJIIIIZZ(string2, "if (dynamicPrompt.prompt…namicPrompt.learnMoreText");
        String str3 = facebookSocialPromptV2flagsModel.promptExcludeTitle;
        if (str3 == null || str3.length() == 0) {
            string3 = context.getString(R.string.g8g);
        } else {
            string3 = facebookSocialPromptV2flagsModel.helpCenterLinkText;
        }
        o.LJIIIIZZ(string3, "if (dynamicPrompt.prompt…Prompt.helpCenterLinkText");
        if (C52426Khq.LIZ()) {
            LIZIZ = Q8U.LIZIZ(new Object[]{string2}, 1, string, "format(this, *args)");
        } else {
            LIZIZ = C00F.LIZIZ(string, ' ', string2);
        }
        if (C52426Khq.LIZ()) {
            CharSequence LIZIZ2 = LIZIZ(context, string3, LIZIZ);
            if (C52232Kei.LIZ() == 2) {
                c116724i4 = new C116724i4();
                String string5 = context.getString(R.string.rx9);
                o.LJIIIIZZ(string5, "context.getString(R.stri…fbFriendsSync_popUpTitle)");
                c116724i4.LJ(string5);
                c116724i4.LIZIZ(" ");
                c116724i4.LIZLLL(LIZIZ2);
            } else {
                c116724i4 = new C116724i4();
                c116724i4.LIZLLL(LIZIZ2);
            }
            return c116724i4.LIZ;
        }
        String string6 = context.getString(R.string.g8i);
        o.LJIIIIZZ(string6, "context.getString(R.stri…k_social_prompt_v2_title)");
        if (C52232Kei.LIZ() == 2) {
            LIZIZ = C00F.LIZIZ(string6, ' ', LIZIZ);
        }
        return LIZIZ(context, string3, LIZIZ);
    }

    public static void LIZJ(C26231ARf c26231ARf, Context context) {
        o.LJIIIZ(context, "context");
        TuxTextView tuxTextView = (TuxTextView) c26231ARf.LJFF(R.id.bui);
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        tuxTextView.setHighlightColor(0);
        tuxTextView.setTuxFont(41);
        tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gu, context));
    }

    public static final CharSequence LIZIZ(Context context, String str, String sourceText) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sourceText, "sourceText");
        String LIZIZ = Q8U.LIZIZ(new Object[]{str}, 1, sourceText, "format(format, *args)");
        int LJJLIIIJL = s.LJJLIIIJL(LIZIZ, str, 0, false, 6);
        SpannableString spannableString = new SpannableString(LIZIZ);
        if (LJJLIIIJL != -1) {
            spannableString.setSpan(new C77279UUp(context, AnonymousClass636.LJIIIIZZ(R.attr.gu, context)), LJJLIIIJL, str.length() + LJJLIIIJL, 33);
        }
        return spannableString;
    }
}
