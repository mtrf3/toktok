package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Trace;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestDialogManager;
import com.bytedance.bdlocation.callback.BDRestrictedMode;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.s;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.service.CaptionKevaServiceImpl;
import com.ss.android.ugc.aweme.service.CaptionServiceImpl;
import com.ss.android.ugc.aweme.service.ICaptionKevaService;
import com.ss.android.ugc.aweme.share.ShareExtServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tiktok.location_api.service.PopupSceneV2;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import defpackage.e1;
import defpackage.i0;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.UxK, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78866UxK implements BDRestrictedMode, InterfaceC87755YcJ, InterfaceC63353Oth, W57, ORL {
    public static boolean LJLIL;
    public static Gson LJLILLLLZI;

    public static void LJJLIIIIJ() {
        C4FF.LIZ(true, false);
        if (C113634d5.LIZ()) {
            AbstractC71812rp.LJIIJJI(C71512rL.LJII, null, true, 1);
        }
        if (C71922s0.LIZ().enable) {
            AbstractC71812rp.LJIIJJI(C71572rR.LJII, null, true, 1);
        }
    }

    public static final void LJJLIIJ(Typeface typeface, Context context) {
        o.LJIIIZ(null, "variationSettings");
        throw null;
    }

    @Override // X.InterfaceC87755YcJ
    public void LIZ() {
        C44938HkM.LIZIZ = false;
    }

    @Override // X.InterfaceC87755YcJ
    public void LIZIZ() {
    }

    @Override // X.W57
    public void LIZJ(String str, String str2) {
    }

    @Override // X.InterfaceC87755YcJ
    public void LJ() {
        C44938HkM.LIZIZ = true;
    }

    @Override // X.ORL
    public Object[] LJFF(Object obj, ArrayList arrayList, File file, ArrayList arrayList2) {
        return (Object[]) C40654FxS.LIZIZ(obj, "makePathElements", Object[].class, List.class, arrayList, File.class, file, List.class, arrayList2);
    }

    @Override // X.W57
    public void LJI(String str, Throwable th) {
    }

    @Override // X.InterfaceC87755YcJ
    public void LJII() {
        C44938HkM.LIZIZ = false;
    }

    @Override // X.W57
    public boolean LJIIIIZZ(int i) {
        return false;
    }

    @Override // X.W57
    public void LJIIIZ(int i) {
    }

    @Override // X.W57
    public void d(String str, String str2) {
    }

    @Override // X.W57
    public void d(String str, String str2, Throwable th) {
    }

    @Override // X.W57
    public void e(String str, String str2) {
    }

    @Override // X.W57
    public void e(String str, String str2, Throwable th) {
    }

    @Override // X.InterfaceC87755YcJ
    public void onFailed() {
        C44938HkM.LIZIZ = false;
    }

    @Override // X.W57
    public void v(String str, String str2) {
    }

    @Override // X.W57
    public void w(String str, String str2) {
    }

    @Override // X.W57
    public void w(String str, String str2, Throwable th) {
    }

    public static void LJJIIJ() {
        if (!LJLIL) {
            return;
        }
        Trace.endSection();
    }

    public static final int LJJJJI() {
        return C00F.LIZ(31744, 1280, "player_sr_max_height", true);
    }

    public static final int LJJJJIZL() {
        return C00F.LIZ(31744, 720, "player_sr_max_width", true);
    }

    public static final int LJJJJJ() {
        return C00F.LIZ(31744, 0, "preload_pcdn_first_frame_go_cdn_size", true);
    }

    public static final boolean LJJJJJL() {
        return e1.LIZ(31744, "player_sr_ignore_resolution_limit", true, false);
    }

    @Override // com.bytedance.bdlocation.callback.BDRestrictedMode
    public int getRestrictedMode() {
        IAccountService LJIJ = AccountService.LJIJ();
        if (LJIJ != null && LJIJ.LJFF().isLogin() && AV1.LJIILLIIL()) {
            return 1;
        }
        return 2;
    }

    public static final C83547Wqd LJIIJ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        return new C83547Wqd(activity, C5SL.LIZ);
    }

    public static void LJIJ(String str) {
        if (!LJLIL) {
            return;
        }
        Trace.beginSection(str);
    }

    public static String LJJI(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 6; i >= 0; i -= 2) {
            try {
                sb.append(CastIntegerProtector.parseInt(str.substring(i, i + 2), 16));
                if (i != 0) {
                    sb.append('.');
                }
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return sb.toString();
    }

    public static String LJJIFFI(String str) {
        String LJJI;
        String[] split = str.split(":");
        if (split.length != 2) {
            return null;
        }
        try {
            long parseLong = CastLongProtector.parseLong(split[1], 16);
            String str2 = split[0];
            if (str2.length() == 8) {
                String LJJI2 = LJJI(str2);
                if (LJJI2 == null) {
                    return null;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(LJJI2);
                LIZ.append(":");
                LIZ.append(parseLong);
                return X1D.LIZIZ(LIZ);
            }
            if (str2.length() != 32 || (LJJI = LJJI(str2.substring(24))) == null) {
                return null;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            String substring = str2.substring(0, 24);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <= 16; i += 8) {
                for (int i2 = 6; i2 >= 0; i2 -= 2) {
                    int i3 = i + i2;
                    sb.append(substring.substring(i3, i3 + 2));
                }
                sb.append(':');
            }
            LIZ2.append(sb.toString());
            LIZ2.append(LJJI);
            LIZ2.append(":");
            LIZ2.append(parseLong);
            return X1D.LIZIZ(LIZ2);
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static final void LJJII(WeakReference weakReference) {
        Object obj;
        Dialog dialog;
        DialogFragment dialogFragment;
        Object obj2 = null;
        if (weakReference != null) {
            obj = weakReference.get();
        } else {
            obj = null;
        }
        if ((obj instanceof DialogFragment) && (dialogFragment = (DialogFragment) obj) != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
        if (weakReference != null) {
            obj2 = weakReference.get();
        }
        if ((obj2 instanceof Dialog) && (dialog = (Dialog) obj2) != null) {
            C29306Beo.LJJJJ(dialog);
        }
    }

    public static void LJJIIJZLJL(View view) {
        if (view != null) {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "delegateView.context");
            int LIZIZ = (int) C74275TDb.LIZIZ(context, 48.0f);
            Context context2 = view.getContext();
            o.LJIIIIZZ(context2, "delegateView.context");
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC72846SiQ(LIZIZ, (int) C74275TDb.LIZIZ(context2, 48.0f), view));
        }
    }

    public static final int LJJIJ(TEZ findFirstRemoteCategoryIndex) {
        o.LJIIIZ(findFirstRemoteCategoryIndex, "$this$findFirstRemoteCategoryIndex");
        java.util.Map<String, TI9> LIZLLL = findFirstRemoteCategoryIndex.LJJJJLL().LJFF().LIZLLL();
        ArrayList arrayList = new ArrayList(LIZLLL.size());
        Iterator<Map.Entry<String, TI9>> it = LIZLLL.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        int i = 0;
        for (Object obj : C30581Hy.LJIILJJIL(findFirstRemoteCategoryIndex.LJJJJLL().LIZ())) {
            int i2 = i + 1;
            if (i >= 0) {
                if (!arrayList.contains(((EffectCategoryModel) obj).getKey())) {
                    return i;
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return 0;
    }

    public static final VideoPublishEditModel LJJIJIL(Intent intent) {
        o.LJIIIZ(intent, "<this>");
        Serializable serializableExtra = intent.getSerializableExtra("KEY_VIDEO_PUBLISH_EDIT_MODEL");
        o.LJII(serializableExtra, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) serializableExtra;
        videoPublishEditModel.creativeModel = C78996UzQ.LJIILL(intent);
        return videoPublishEditModel;
    }

    public static String LJJIJL(String str) {
        if (TextUtils.equals(str, "live") || TextUtils.equals(str, "live_event")) {
            return EnumC78867UxL.LIVE.name();
        }
        if (TextUtils.equals(str, "comment") || TextUtils.equals(str, "qna") || TextUtils.equals(str, "group") || TextUtils.equals(str, "invite_friends")) {
            return EnumC78867UxL.SOCIAL.name();
        }
        if (TextUtils.equals(str, "sticker")) {
            return EnumC78867UxL.CREATION.name();
        }
        if (TextUtils.equals(str, "challenge")) {
            return EnumC78867UxL.TECH.name();
        }
        if (TextUtils.equals(str, "playlist")) {
            return EnumC78867UxL.MUSIC.name();
        }
        if (TextUtils.equals(str, "user")) {
            return EnumC78867UxL.ACCOUNT.name();
        }
        if (TextUtils.equals(str, "aweme")) {
            return EnumC78867UxL.MAIN.name();
        }
        if (TextUtils.equals(str, "search")) {
            return EnumC78867UxL.SEARCH.name();
        }
        return EnumC78867UxL.UNKNOWN.name();
    }

    public static final String LJJIJLIJ(User user) {
        String socialInfo;
        String socialInfo2 = user.getSocialInfo();
        if (socialInfo2 == null || socialInfo2.length() == 0) {
            MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
            if (matchedFriendStruct == null || (socialInfo = matchedFriendStruct.getSocialInfo()) == null) {
                return "";
            }
            return socialInfo;
        }
        String socialInfo3 = user.getSocialInfo();
        o.LJIIIIZZ(socialInfo3, "{\n        socialInfo\n    }");
        return socialInfo3;
    }

    public static final String LJJIZ(InterfaceC55235Lm3 interfaceC55235Lm3) {
        C50433Jqn searchCommonModel;
        String isFromComment;
        C50652JuK.Companion.getClass();
        C50650JuI LJIIIIZZ = C50651JuJ.LJIIIIZZ(interfaceC55235Lm3);
        if (LJIIIIZZ == null || (searchCommonModel = LJIIIIZZ.getSearchCommonModel()) == null || (isFromComment = searchCommonModel.isFromComment()) == null) {
            return "";
        }
        return isFromComment;
    }

    public static final String LJJJ(InterfaceC55235Lm3 interfaceC55235Lm3) {
        C50373Jpp searchEventModel;
        String isFromPhoto;
        C50652JuK.Companion.getClass();
        C50650JuI LJIIIIZZ = C50651JuJ.LJIIIIZZ(interfaceC55235Lm3);
        if (LJIIIIZZ == null || (searchEventModel = LJIIIIZZ.getSearchEventModel()) == null || (isFromPhoto = searchEventModel.isFromPhoto()) == null) {
            return "";
        }
        return isFromPhoto;
    }

    public static Drawable LJJJJ(CQW cqw) {
        Drawable drawable;
        if (cqw != null && (drawable = C31418CUs.LJ.get(cqw)) != null) {
            return drawable;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(C31418CUs.LIZJ);
        return gradientDrawable;
    }

    public static String LJJJJLI(String str) {
        List LJIIL;
        if (TextUtils.isEmpty(str) || !str.contains("challenge/detail") || (LJIIL = C30591Hz.LJIIL(str)) == null || LJIIL.size() <= 0) {
            return null;
        }
        return (String) C64504PTg.LIZIZ(LJIIL, -1, LJIIL);
    }

    public static final boolean LJJJLIIL(ActivityC45651qj activityC45651qj) {
        String str;
        C50948Jz6 c50948Jz6 = JTO.LIZ(activityC45651qj).LJLIL;
        if (c50948Jz6 != null) {
            str = c50948Jz6.getEnterSearchFrom();
        } else {
            str = null;
        }
        if (o.LJ(str, "discovery")) {
            return true;
        }
        if (LJJJLL(activityC45651qj) && ((Number) C34120DaG.LIZ.getValue()).intValue() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJLL(ActivityC45651qj activityC45651qj) {
        String str;
        String str2;
        String str3;
        String str4;
        C50948Jz6 c50948Jz6 = JTO.LIZ(activityC45651qj).LJLIL;
        String str5 = null;
        if (c50948Jz6 != null) {
            str = c50948Jz6.getEnterSearchFrom();
        } else {
            str = null;
        }
        if (!o.LJ(str, "homepage_hot")) {
            C50948Jz6 c50948Jz62 = JTO.LIZ(activityC45651qj).LJLIL;
            if (c50948Jz62 != null) {
                str2 = c50948Jz62.getEnterSearchFrom();
            } else {
                str2 = null;
            }
            if (!o.LJ(str2, "homepage_follow")) {
                C50948Jz6 c50948Jz63 = JTO.LIZ(activityC45651qj).LJLIL;
                if (c50948Jz63 != null) {
                    str3 = c50948Jz63.getEnterSearchFrom();
                } else {
                    str3 = null;
                }
                if (!o.LJ(str3, "homepage_friends")) {
                    C50948Jz6 c50948Jz64 = JTO.LIZ(activityC45651qj).LJLIL;
                    if (c50948Jz64 != null) {
                        str4 = c50948Jz64.getEnterSearchFrom();
                    } else {
                        str4 = null;
                    }
                    if (!o.LJ(str4, "homepage_popular")) {
                        C50948Jz6 c50948Jz65 = JTO.LIZ(activityC45651qj).LJLIL;
                        if (c50948Jz65 != null) {
                            str5 = c50948Jz65.getEnterSearchFrom();
                        }
                        if (!o.LJ(str5, "homepage_nearby")) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static final boolean LJJJLZIJ(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
        if (videoPublishEditModel.isMvThemeVideoType() && !videoPublishEditModel.isPhotoMvMode && !videoPublishEditModel.isDraftMusicIllegal()) {
            return true;
        }
        if ((!videoPublishEditModel.mIsFromDraft && H7R.LJIIL(videoPublishEditModel)) || ((z = videoPublishEditModel.mIsFromDraft) && videoPublishEditModel.editMusicSyncMode)) {
            return true;
        }
        if ((videoPublishEditModel.recordMode != 1 || z) && extractAVMusic != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJZ(VideoPublishEditModel model) {
        List<String> list;
        List list2;
        o.LJIIIZ(model, "model");
        String LJIILLIIL = C78841Uwv.LJIILLIIL(MusicBeanUtilKt.extractAVMusic(model.creativeModel.musicBuzModel));
        MvCreateVideoData mvCreateVideoData = model.mvCreateVideoData;
        if (mvCreateVideoData != null) {
            list = mvCreateVideoData.musicIds;
        } else {
            list = null;
        }
        if (!C77413UZt.LJIILL(list)) {
            MvCreateVideoData mvCreateVideoData2 = model.mvCreateVideoData;
            if (mvCreateVideoData2 == null || (list2 = mvCreateVideoData2.musicIds) == null) {
                list2 = C61878OQg.INSTANCE;
            }
            if (list2.contains(LJIILLIIL)) {
                return true;
            }
        }
        return false;
    }

    public static final MainActivityScope LJJLIIIJ(View view) {
        o.LJIIIZ(view, "<this>");
        Context context = view.getContext();
        o.LJIIIIZZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            return LJJLIIIJJI(LJJIFFI);
        }
        return null;
    }

    public static final MainActivityScope LJJLIIIJILLIZJL(Fragment fragment) {
        o.LJIIIZ(fragment, "<this>");
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity != null) {
            return LJJLIIIJJI(mo49getActivity);
        }
        return null;
    }

    public static final MainActivityScope LJJLIIIJJI(ActivityC45651qj activityC45651qj) {
        o.LJIIIZ(activityC45651qj, "<this>");
        if (!(activityC45651qj instanceof InterfaceC55058LjC)) {
            return null;
        }
        MainActivityScope mainActivityScope = (MainActivityScope) new ViewModelProvider(activityC45651qj).get(MainActivityScope.class);
        if (mainActivityScope.LJLIL == null || C52233Kej.LIZ()) {
            mainActivityScope.LJLIL = C55230Lly.LIZLLL(activityC45651qj, null);
        }
        return mainActivityScope;
    }

    public static final MainActivityScope LJJLIIIJJIZ(C8W0 c8w0) {
        o.LJIIIZ(c8w0, "<this>");
        ActivityC45651qj LIZ = C212428Vi.LIZ(c8w0);
        if (LIZ != null) {
            return LJJLIIIJJI(LIZ);
        }
        return null;
    }

    public static final boolean LJJLIIIJL(Aweme aweme) {
        ICaptionKevaService LJJJJI;
        if (!((RBX) HG3.LJIILL()).getCurUserId().equals(aweme.getAuthorUid())) {
            return false;
        }
        ICaptionKevaService LJJJJI2 = CaptionKevaServiceImpl.LJJJJI();
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        if (!LJJJJI2.LJIJI(aid) || !CaptionServiceImpl.LJIILIIL().LJIIIIZZ(aweme) || (LJJJJI = CaptionKevaServiceImpl.LJJJJI()) == null || !(!LJJJJI.LJJI())) {
            return false;
        }
        return true;
    }

    public static final C5H3 LJJLIIIJLJLI(InterfaceC65784Pro initializer) {
        o.LJIIIZ(initializer, "initializer");
        return C221108m2.LIZ(EnumC221088m0.NONE, initializer);
    }

    public static final boolean LJJLJLI(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "<this>");
        if (LJJLL(shortVideoContext) && (!GX0.LIZ() || C77123UOp.LJJ(shortVideoContext))) {
            return true;
        }
        return false;
    }

    public static final boolean LJJLL(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "<this>");
        if (!C41669GWz.LIZ() || V16.LJJIIJ(shortVideoContext) || shortVideoContext.LJJJI() || shortVideoContext.LJJIJIIJI() || shortVideoContext.creativeModel.paidContentModel.getCollectionId().length() != 0) {
            return false;
        }
        return true;
    }

    public static final EnumC28000Ayq LJJZZIII(Integer num) {
        String LIZ = SAM.LIZ();
        String str = null;
        if (LIZ != null) {
            str = LIZ.toUpperCase(Locale.ROOT);
            o.LJIIIIZZ(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        }
        if (o.LJ(str, "SA")) {
            return EnumC28000Ayq.TTF;
        }
        for (EnumC28000Ayq enumC28000Ayq : EnumC28000Ayq.values()) {
            int bizType = enumC28000Ayq.getBizType();
            if (num != null && bizType == num.intValue()) {
                return enumC28000Ayq;
            }
        }
        return EnumC28000Ayq.TTS;
    }

    public static final void LJL(EditText editText) {
        int i;
        int i2;
        Editable text = editText.getText();
        o.LJIIIIZZ(text, "text");
        String obj = text.toString();
        int length = obj.length();
        if (((Boolean) C42552Gmy.LIZ.getValue()).booleanValue() && obj.length() == 0) {
            return;
        }
        if (!C40976G6i.LIZ()) {
            i = 0;
            while (i < length && o.LJIIJJI(obj.charAt(i), 32) <= 0) {
                i++;
            }
        } else {
            i = 0;
            while (i < length && obj.charAt(i) == ' ') {
                i++;
            }
        }
        if (!C40976G6i.LIZ()) {
            i2 = length;
            while (i2 > i) {
                int i3 = i2 - 1;
                if (o.LJIIJJI(obj.charAt(i3), 32) > 0) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        } else {
            i2 = length;
            while (i2 > i) {
                int i4 = i2 - 1;
                if (obj.charAt(i4) != ' ') {
                    break;
                } else {
                    i2 = i4;
                }
            }
        }
        if (i < i2) {
            int i5 = i2 + 1;
            if (i5 < length) {
                text.delete(i5, length);
            }
            text.delete(0, i);
            return;
        }
        editText.setText("");
    }

    @Override // X.InterfaceC63353Oth
    public /* bridge */ /* synthetic */ void LIZLLL(Object obj) {
    }

    public static final InterfaceC07790Sh LJIIL(InterfaceC07790Sh interfaceC07790Sh, float f) {
        o.LJIIIZ(interfaceC07790Sh, "<this>");
        if (f == 1.0f) {
            return interfaceC07790Sh;
        }
        return C78847Ux1.LJJIIZI(interfaceC07790Sh, 0.0f, 0.0f, f, 0.0f, 0.0f, null, true, 61435);
    }

    public static final void LJIILIIL(JHL jhl, Aweme aweme) {
        String str;
        o.LJIIIZ(jhl, "<this>");
        if (aweme == null) {
            return;
        }
        String str2 = "1";
        if (aweme.getContentOriginalType() != 0) {
            int contentOriginalType = aweme.getContentOriginalType();
            if (contentOriginalType != 1) {
                if (contentOriginalType == 2) {
                    str = "1";
                } else if (contentOriginalType != 3) {
                    str = "";
                } else {
                    str = "2";
                }
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            jhl.LIZLLL("is_original", str);
        }
        String shootTabName = aweme.getShootTabName();
        if (shootTabName != null && shootTabName.length() != 0 && aweme.getContentOriginalType() == 2) {
            jhl.LIZLLL("shoot_tab_name", aweme.getShootTabName());
        }
        String contentType = aweme.getContentType();
        if (contentType != null && contentType.length() != 0) {
            jhl.LIZLLL("publish_content_type", aweme.getContentType());
        }
        if (aweme.getContentSizeType() != 0) {
            if (aweme.getContentSizeType() != 2) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            jhl.LIZLLL("is_multi_content", str2);
        }
    }

    public static final String LJIILJJIL(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        if (!TextUtils.isEmpty(str)) {
            str2 = i0.LJFF(" AND ", str2);
        }
        LIZ.append(str2);
        return X1D.LIZIZ(LIZ);
    }

    public static final void LJIILL(String str, JSONObject jSONObject) {
        java.util.Set<Map.Entry<String, j>> entrySet;
        if (str != null) {
            try {
                m mVar = (m) C75792yF.LIZ(str, m.class);
                if (mVar != null && (entrySet = mVar.entrySet()) != null) {
                    for (Map.Entry<String, j> entry : entrySet) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("social_info_");
                        LIZ.append(entry.getKey());
                        jSONObject.put(X1D.LIZIZ(LIZ), entry.getValue().LJJIFFI());
                    }
                }
            } catch (s unused) {
            }
        }
    }

    public static final void LJIILLIIL(C188727au c188727au, User user) {
        java.util.Set<Map.Entry<String, j>> entrySet;
        if (user != null) {
            try {
                m mVar = (m) C75792yF.LIZ(LJJIJLIJ(user), m.class);
                if (mVar != null && (entrySet = mVar.entrySet()) != null) {
                    for (Map.Entry<String, j> entry : entrySet) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("social_info_");
                        LIZ.append(entry.getKey());
                        c188727au.LJI(X1D.LIZIZ(LIZ), entry.getValue().LJJIFFI());
                    }
                }
            } catch (s unused) {
            }
        }
    }

    public static final void LJIIZILJ(JHM jhm, User user) {
        java.util.Set<Map.Entry<String, j>> entrySet;
        o.LJIIIZ(jhm, "<this>");
        if (user != null) {
            try {
                m mVar = (m) C75792yF.LIZ(LJJIJLIJ(user), m.class);
                if (mVar != null && (entrySet = mVar.entrySet()) != null) {
                    for (Map.Entry<String, j> entry : entrySet) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("social_info_");
                        LIZ.append(entry.getKey());
                        jhm.LIZLLL(X1D.LIZIZ(LIZ), entry.getValue().LJJIFFI());
                    }
                }
            } catch (s unused) {
            }
        }
    }

    public static final boolean LJIJJLI(TO9 checkIsDownloading, Object obj) {
        o.LJIIIZ(checkIsDownloading, "$this$checkIsDownloading");
        OSZ<EnumC74565TOf, Boolean> LIZJ = checkIsDownloading.LIZJ(obj);
        if (LIZJ == null) {
            return false;
        }
        EnumC74565TOf first = LIZJ.getFirst();
        if (first != EnumC74565TOf.PENDING && first != EnumC74565TOf.START) {
            return false;
        }
        return true;
    }

    public static final boolean LJJ(String scene, List list) {
        o.LJIIIZ(scene, "scene");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (o.LJ(((PopupSceneV2) it.next()).scene, scene)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x019c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIII(java.io.File r28, java.io.File r29) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78866UxK.LJJIII(java.io.File, java.io.File):void");
    }

    public static final int LJJIIZ(TEZ findCategoryIndex, String str) {
        o.LJIIIZ(findCategoryIndex, "$this$findCategoryIndex");
        Iterator it = C30581Hy.LJIILJJIL(findCategoryIndex.LJJJJLL().LIZ()).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (o.LJ(((EffectCategoryModel) it.next()).getKey(), str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final PopupSceneV2 LJJIJIIJIL(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PopupSceneV2 popupSceneV2 = (PopupSceneV2) it.next();
            if (o.LJ(popupSceneV2.scene, str)) {
                return popupSceneV2;
            }
        }
        return null;
    }

    public static final boolean LJJJJLL(TEZ isCurrentChildEffect, Effect effect) {
        o.LJIIIZ(isCurrentChildEffect, "$this$isCurrentChildEffect");
        return isCurrentChildEffect.LJIIIIZZ().LIZIZ(effect);
    }

    public static final boolean LJJJJZ(TEZ isCurrentUseChildEffect, Effect effect) {
        String str;
        o.LJIIIZ(isCurrentUseChildEffect, "$this$isCurrentUseChildEffect");
        if (effect == null) {
            return false;
        }
        String effectId = effect.getEffectId();
        Effect LJJIIZI = isCurrentUseChildEffect.LJJIIZI();
        String str2 = null;
        if (LJJIIZI != null) {
            str = LJJIIZI.getEffectId();
        } else {
            str = null;
        }
        if (!o.LJ(effectId, str)) {
            if (!o.LJ(isCurrentUseChildEffect.LJJIL().LJLIL, "livestreaming")) {
                return false;
            }
            String resourceId = effect.getResourceId();
            Effect LJJIIZI2 = isCurrentUseChildEffect.LJJIIZI();
            if (LJJIIZI2 != null) {
                str2 = LJJIIZI2.getResourceId();
            }
            if (!o.LJ(resourceId, str2)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJJJJZI(TEZ isCurrentUseEffect, Effect effect) {
        String str;
        o.LJIIIZ(isCurrentUseEffect, "$this$isCurrentUseEffect");
        if (effect == null) {
            return false;
        }
        String effectId = effect.getEffectId();
        Effect LLJJIJIIJIL = isCurrentUseEffect.LLJJIJIIJIL();
        String str2 = null;
        if (LLJJIJIIJIL != null) {
            str = LLJJIJIIJIL.getEffectId();
        } else {
            str = null;
        }
        if (!o.LJ(effectId, str)) {
            if (!o.LJ(isCurrentUseEffect.LJJIL().LJLIL, "livestreaming")) {
                return false;
            }
            String resourceId = effect.getResourceId();
            Effect LLJJIJIIJIL2 = isCurrentUseEffect.LLJJIJIIJIL();
            if (LLJJIJIIJIL2 != null) {
                str2 = LLJJIJIIJIL2.getResourceId();
            }
            if (!o.LJ(resourceId, str2)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJJL(TEZ judgeNeedPreDownload, Effect effect) {
        o.LJIIIZ(judgeNeedPreDownload, "$this$judgeNeedPreDownload");
        o.LJIIIZ(effect, "effect");
        if (effect.getEffectType() != 0 || judgeNeedPreDownload.LJJJJLL().LJIJJLI().LIZ(effect, false)) {
            return false;
        }
        return true;
    }

    public static final void LJJLIIIJLLLLLLLZ(Intent intent, VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        intent.putExtra("KEY_VIDEO_PUBLISH_EDIT_MODEL", (Serializable) model);
        CreativeModel creativeModel = model.creativeModel;
        o.LJIIIIZZ(creativeModel, "model.creativeModel");
        C78996UzQ.LJJIZ(intent, creativeModel);
    }

    public static final void LJJLIL(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    public static final void LJJLJ(int i, View view) {
        o.LJIIIZ(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            view.setLayoutParams(layoutParams);
        }
    }

    public static void LJLI(PEF pef, boolean z) {
        pef.LJFF = PGQ.LIZ().LIZJ(z);
    }

    public static String LJIIJJI(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (!str2.contains("utm_source")) {
            C38281F0r c38281F0r = new C38281F0r(str2);
            c38281F0r.LIZLLL("utm_source", str3);
            c38281F0r.LIZLLL("utm_campaign", "client_share");
            c38281F0r.LIZLLL("utm_medium", "android");
            c38281F0r.LIZLLL("share_iid", AppLog.getInstallId());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(UUID.randomUUID());
            LIZ.append("");
            c38281F0r.LIZLLL("share_link_id", X1D.LIZIZ(LIZ));
            c38281F0r.LIZ(EF7.LJIIIZ, "share_app_id");
            c38281F0r.LIZLLL("ugbiz_name", LJJIJL(str));
            String LIZIZ = C44927HkB.LIZIZ();
            if (!TextUtils.isEmpty(LIZIZ)) {
                c38281F0r.LIZLLL("ug_btm", LIZIZ);
            }
            C57135Mbb.LIZIZ.LIZIZ().LIZIZ(ShareExtServiceImpl.LJJLIIJ().LJIIIIZZ(str, c38281F0r.LIZ), c38281F0r);
            return c38281F0r.LJ();
        }
        if (str2.contains("is_ad_landing_page=1")) {
            return str2;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("utm_source=");
        LIZ2.append(str3);
        return str2.replaceAll("utm_source=\\w*_?\\w?", X1D.LIZIZ(LIZ2));
    }

    public static void LJIL(String str, boolean z, Object... objArr) {
        if (z) {
        } else {
            throw new IllegalStateException(C16880lQ.LLLZ(str, objArr));
        }
    }

    public static final Effect LJJIIZI(TEZ findFirstNotDownload, List stickers, int i) {
        o.LJIIIZ(findFirstNotDownload, "$this$findFirstNotDownload");
        o.LJIIIZ(stickers, "stickers");
        if (stickers.size() - 2 < i) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        int size = stickers.size();
        while (i < size) {
            if (LJJL(findFirstNotDownload, (Effect) ListProtector.get(stickers, i))) {
                return (Effect) ListProtector.get(stickers, i);
            }
            i++;
        }
        return null;
    }

    public static Method LJJJIL(Class cls, String str, Class[] clsArr) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return cls.getMethod(str, clsArr);
            } catch (Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("exception in getMethod, pkg : ");
                LIZ.append(cls.getName());
                LIZ.append(", function : ");
                LIZ.append(str);
                LIZ.append(", ");
                LIZ.append(th.toString());
                X1D.LIZIZ(LIZ);
                try {
                    return cls.getDeclaredMethod(str, clsArr);
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }

    public static Object LJJJJL(Class cls, String str, Object... objArr) {
        Object obj = null;
        if (!TextUtils.isEmpty(str)) {
            Object[] objArr2 = new Object[0];
            try {
                Method LJJJIL = LJJJIL(cls, str, new Class[0]);
                if (LJJJIL != null) {
                    LJJJIL.setAccessible(true);
                    if (objArr.length > 0) {
                        obj = LJJJIL.invoke(objArr[0], objArr2);
                    } else {
                        obj = LJJJIL.invoke(null, objArr2);
                    }
                }
            } catch (Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("exception in invokeMethod, pkg : ");
                LIZ.append(cls.getName());
                LIZ.append(", function : ");
                LIZ.append(str);
                LIZ.append(", ");
                LIZ.append(th.toString());
                X1D.LIZIZ(LIZ);
            }
        }
        return obj;
    }

    public static final List LJJIJIIJI(TEZ findNextNCountNotDownload, List stickers, int i, int i2) {
        o.LJIIIZ(findNextNCountNotDownload, "$this$findNextNCountNotDownload");
        o.LJIIIZ(stickers, "stickers");
        if (stickers.size() - 2 < i) {
            return C61878OQg.INSTANCE;
        }
        if (i2 <= 0) {
            return C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        if (i < 0) {
            i = 0;
        }
        int size = stickers.size();
        while (i < size) {
            if (LJJL(findNextNCountNotDownload, (Effect) ListProtector.get(stickers, i))) {
                arrayList.add(ListProtector.get(stickers, i));
                if (arrayList.size() == i2) {
                    return arrayList;
                }
            }
            i++;
        }
        return arrayList;
    }

    public static java.util.Map LJJLI(List list, CQW emoteType, HashMap emoteModelsCacheMap, boolean z) {
        EmoteModel emoteModel;
        Drawable drawable;
        EmoteModel emoteModel2;
        Resources resources;
        EmoteModel emoteModel3;
        o.LJIIIZ(emoteType, "emoteType");
        o.LJIIIZ(emoteModelsCacheMap, "emoteModelsCacheMap");
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                EmoteModel emoteModel4 = (EmoteModel) obj;
                if (!emoteModelsCacheMap.containsKey(emoteModel4.emoteId) || (emoteModel3 = (EmoteModel) emoteModelsCacheMap.get(emoteModel4.emoteId)) == null || emoteModel3.emoteResource == null) {
                    arrayList.add(obj);
                }
            }
            if ((!arrayList.isEmpty()) && (resources = C31418CUs.LIZLLL) != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (hashSet.add(((EmoteModel) next).emoteId)) {
                        arrayList2.add(next);
                    }
                }
                C31106CIs.LIZLLL(arrayList2, resources, false, -1);
            }
            if (z) {
                return C113554cx.LJJJLIIL();
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                EmoteModel emoteModel5 = (EmoteModel) obj2;
                if (emoteModelsCacheMap.containsKey(emoteModel5.emoteId) && (emoteModel2 = (EmoteModel) emoteModelsCacheMap.get(emoteModel5.emoteId)) != null && emoteModel2.emoteResource != null) {
                    arrayList3.add(obj2);
                }
            }
            HashMap hashMap = new HashMap();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                EmoteModel emoteModel6 = (EmoteModel) it2.next();
                if (emoteModelsCacheMap.containsKey(emoteModel6.emoteId) && (emoteModel = (EmoteModel) emoteModelsCacheMap.get(emoteModel6.emoteId)) != null && emoteModel.emoteResource != null) {
                    EmoteModel emoteModel7 = (EmoteModel) emoteModelsCacheMap.get(emoteModel6.emoteId);
                    if (emoteModel7 != null && (drawable = emoteModel7.emoteResource) != null) {
                        hashMap.put(emoteModel6, drawable);
                        emoteModel6.emoteResource = drawable;
                    }
                } else {
                    hashMap.put(emoteModel6, LJJJJ(emoteType));
                    emoteModel6.emoteResource = LJJJJ(emoteType);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                hashMap.put(it3.next(), LJJJJ(emoteType));
            }
            return hashMap;
        }
        return C113554cx.LJJJLIIL();
    }

    public static final long LJJZ(long j, long j2, long j3, String str) {
        try {
            String property = System.getProperty(str);
            if (property != null) {
                Long LJJIZ = C38350F3i.LJJIZ(property);
                if (LJJIZ != null) {
                    j = LJJIZ.longValue();
                    if (j2 > j || j > j3) {
                        StringBuilder LIZJ = C06490Nh.LIZJ("System property '", str, "' should be in range ", j2);
                        C0MT.LIZLLL(LIZJ, "..", j3, ", but is '");
                        String LIZIZ = C47135Ieh.LIZIZ(LIZJ, j, '\'', LIZJ);
                        LIZIZ.toString();
                        throw new IllegalStateException(LIZIZ);
                    }
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("System property '");
                    LIZ.append(str);
                    LIZ.append("' has unrecognized value '");
                    LIZ.append(property);
                    LIZ.append('\'');
                    String LIZIZ2 = X1D.LIZIZ(LIZ);
                    LIZIZ2.toString();
                    throw new IllegalStateException(LIZIZ2);
                }
            }
        } catch (SecurityException unused) {
        }
        return j;
    }

    public static final Matrix LJJIL(Rect fromRect, int i, int i2, Rect rect, InterfaceC77358UXq listItemScaleType) {
        int i3;
        int i4;
        float f;
        float f2;
        o.LJIIIZ(fromRect, "fromRect");
        o.LJIIIZ(listItemScaleType, "listItemScaleType");
        if (rect != null) {
            i3 = rect.width();
            i4 = rect.height();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (i3 == 0 || i4 == 0 || i4 / i3 >= i2 / i) {
            f = i2;
            f2 = i4;
        } else {
            f = i;
            f2 = i3;
        }
        float f3 = f / f2;
        RectF rectF = new RectF(0.0f, 0.0f, i3, i4);
        Matrix matrix = new Matrix();
        matrix.setScale(f3, f3, i3 / 2, i4 / 2);
        matrix.postTranslate((i - i3) / 2, (i2 - i4) / 2);
        matrix.mapRect(rectF, rectF);
        return listItemScaleType.LIZ(fromRect, rectF);
    }

    public static final AnimatorSet LJJJI(Matrix matrix, Matrix matrix2, Rect rect, WGQ animationConfiguration, InterfaceC88472Yns interfaceC88472Yns) {
        RectF rectF;
        o.LJIIIZ(animationConfiguration, "animationConfiguration");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix2.getValues(fArr2);
        C78870UxO c78870UxO = new C78870UxO(rect, fArr, interfaceC88472Yns);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c78870UxO, PropertyValuesHolder.ofObject(C78868UxM.LIZ, new C78874UxS(new float[9]), fArr, fArr2));
        ofPropertyValuesHolder.setDuration(animationConfiguration.LJFF);
        ofPropertyValuesHolder.setInterpolator(animationConfiguration.LIZIZ);
        V8D v8d = animationConfiguration.LJIIIIZZ;
        if (rect != null) {
            rectF = new RectF(rect);
        } else {
            rectF = null;
        }
        RectF rectF2 = new RectF(rectF);
        RectF rectF3 = new RectF();
        RectF rectF4 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        matrix2.mapRect(rectF4, rectF2);
        float centerX = rectF3.centerX();
        float centerY = rectF3.centerY();
        float centerX2 = rectF4.centerX();
        float centerY2 = rectF4.centerY();
        v8d.getClass();
        Path path = new Path();
        path.moveTo(centerX, centerY);
        path.lineTo(centerX2, centerY2);
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(c78870UxO, PropertyValuesHolder.ofObject(C78868UxM.LIZIZ, (TypeConverter) null, path));
        ofPropertyValuesHolder2.setDuration(animationConfiguration.LJ);
        ofPropertyValuesHolder2.setInterpolator(animationConfiguration.LIZ);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofPropertyValuesHolder, ofPropertyValuesHolder2);
        return animatorSet;
    }

    public static int LJJZZI(String str, int i, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) LJJZ(i, i2, i3, str);
    }

    public static Dialog LJIJI(Dialog dialog, int i, boolean z, boolean z2, boolean z3, int i2) {
        boolean z4;
        boolean z5 = z3;
        boolean z6 = z2;
        int i3 = i;
        boolean z7 = z;
        if ((i2 & 1) != 0) {
            i3 = 0;
        }
        if ((i2 & 2) != 0) {
            z7 = false;
        }
        if ((i2 & 4) != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if ((i2 & 8) != 0) {
            z6 = false;
        }
        if ((i2 & 16) != 0) {
            z5 = false;
        }
        if (dialog == null) {
            return null;
        }
        MultiGuestDialogManager LIZ = TS1.LIZ();
        if (LIZ == null) {
            return dialog;
        }
        TS5 ts5 = new TS5(i3, z7, z4, z6, z5, null, false, true, 256, 0);
        List<OSZ<WeakReference<Object>, TS5>> list = LIZ.LJLJL;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            OSZ osz = (OSZ) next;
            List<Integer> list2 = ts5.LJFF;
            if ((list2 != null && list2.contains(Integer.valueOf(((TS5) osz.getSecond()).LIZ))) || (!ts5.LJI && ((TS5) osz.getSecond()).LIZ == ts5.LIZ)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            OSZ osz2 = (OSZ) it2.next();
            LJJII((WeakReference) osz2.getFirst());
            ((TS5) osz2.getSecond()).LJII = false;
        }
        LIZ.hv0();
        ((ArrayList) LIZ.LJLJL).add(new OSZ(new WeakReference(dialog), ts5));
        return dialog;
    }

    public static DialogFragment LJIJJ(DialogFragment dialogFragment, int i, boolean z, boolean z2, List list, int i2, int i3) {
        boolean z3;
        boolean z4 = z;
        int i4 = i;
        boolean z5 = z2;
        List list2 = list;
        int i5 = i2;
        if ((i3 & 1) != 0) {
            i4 = 0;
        }
        if ((i3 & 2) != 0) {
            z4 = false;
        }
        if ((i3 & 4) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if ((i3 & 8) != 0) {
            z5 = false;
        }
        if ((i3 & 32) != 0) {
            list2 = null;
        }
        if ((i3 & 128) != 0) {
            i5 = 0;
        }
        if (dialogFragment == null) {
            return null;
        }
        MultiGuestDialogManager LIZ = TS1.LIZ();
        if (LIZ == null) {
            return dialogFragment;
        }
        TS5 ts5 = new TS5(i4, z4, z3, z5, false, list2, false, true, i5);
        List<OSZ<WeakReference<Object>, TS5>> list3 = LIZ.LJLJL;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list3).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            OSZ osz = (OSZ) next;
            List<Integer> list4 = ts5.LJFF;
            if ((list4 != null && list4.contains(Integer.valueOf(((TS5) osz.getSecond()).LIZ))) || (!ts5.LJI && ((TS5) osz.getSecond()).LIZ == ts5.LIZ)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            OSZ osz2 = (OSZ) it2.next();
            LJJII((WeakReference) osz2.getFirst());
            ((TS5) osz2.getSecond()).LJII = false;
        }
        LIZ.hv0();
        ((ArrayList) LIZ.LJLJL).add(new OSZ(new WeakReference(dialogFragment), ts5));
        return dialogFragment;
    }
}
