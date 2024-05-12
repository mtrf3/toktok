package com.ss.android.ugc.aweme.music.assem;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C188727au;
import X.C1DJ;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C240249bo;
import X.C246139lJ;
import X.C32I;
import X.C47704Ins;
import X.C51029K0z;
import X.C55749LuL;
import X.C61520OCm;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C98T;
import X.C9BE;
import X.FMX;
import X.HG3;
import X.O3E;
import X.OSZ;
import X.RBX;
import X.SYL;
import X.T5U;
import X.TBT;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.assem.MusicListArtistCertificationAssem;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.profile.model.ClaimStatus;
import com.ss.android.ugc.aweme.profile.model.MusicTabClaimInfo;
import com.ss.android.ugc.aweme.profile.model.MusicTabInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MusicListArtistCertificationAssem extends UIContentAssem {
    public final C55749LuL LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C214298b3 LJLJI;

    public MusicListArtistCertificationAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, OriginMusicArg.class, null), checkSupervisorPrepared());
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 403));
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 404);
        C65776Prg LIZ = C65352Pkq.LIZ(OriginMusicListViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 405), C240249bo.INSTANCE, aqS154S0100000_4);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        try {
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setLazyUpdate(true);
            String accessKey = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAccessKey();
            C61520OCm LIZ = O3E.LIZ(accessKey);
            if (LIZ != null) {
                List<String> preloadChannels = C246139lJ.LIZJ().getPreloadChannels();
                ArrayList arrayList = new ArrayList(C32I.LJJL(preloadChannels, 10));
                Iterator<String> it = preloadChannels.iterator();
                while (it.hasNext()) {
                    arrayList.add(new CheckRequestBodyModel.TargetChannel(it.next()));
                }
                LIZ.LIZ(null, C51029K0z.LJJIIZI(new OSZ(accessKey, arrayList)), optionCheckUpdateParams);
            }
        } catch (Throwable unused) {
        }
        final Context context = getContext();
        if (context == null) {
            return;
        }
        final User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        final View LLLZIIL = C16880lQ.LLLZIIL(R.layout.c5l, C16880lQ.LLZIL(context), null);
        ((SYL) this.LJLILLLLZI.getValue()).LJLJL(0, LLLZIIL);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(R.string.bu1));
        String string = context.getString(R.string.bu0);
        o.LJIIIIZZ(string, "context.getString(R.stri…ePage_tabBanner_textLink)");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) string);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.eb, context)), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new T5U(62, false), length, spannableStringBuilder.length(), 33);
        ((TextView) LLLZIIL.findViewById(R.id.i9z)).setText(spannableStringBuilder);
        View findViewById = LLLZIIL.findViewById(R.id.i9x);
        o.LJIIIIZZ(findViewById, "soundOnView.profile_sound_on_close");
        C16880lQ.LJIIJ(new C98T() { // from class: X.9bl
            @Override // X.C98T
            public final void LIZ(View view2) {
                if (view2 != null) {
                    ((Keva) C240229bm.LIZ.getValue()).storeBoolean("key_music_sound_on_banner_closed", true);
                    ((SYL) MusicListArtistCertificationAssem.this.LJLILLLLZI.getValue()).LJLLILLLL(LLLZIIL);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, findViewById);
        C16880lQ.LJIIJ(new C98T() { // from class: X.9lI
            @Override // X.C98T
            public final void LIZ(View view2) {
                MusicTabInfo musicTabInfo;
                Integer num;
                String LJ;
                String str2;
                MusicTabClaimInfo musicTabClaimInfo;
                if (view2 == null || (musicTabInfo = User.this.getMusicTabInfo()) == null) {
                    return;
                }
                if (musicTabInfo.getMusicTabClaimInfo() == null || ((musicTabClaimInfo = musicTabInfo.getMusicTabClaimInfo()) != null && musicTabClaimInfo.getStatus() == ClaimStatus.UNCLAIMED.getValue())) {
                    EnumC246169lM enumC246169lM = EnumC246169lM.MUSIC_TAB_BANNER;
                    ClaimStatus.Companion companion = ClaimStatus.Companion;
                    MusicTabClaimInfo musicTabClaimInfo2 = musicTabInfo.getMusicTabClaimInfo();
                    if (musicTabClaimInfo2 != null) {
                        num = Integer.valueOf(musicTabClaimInfo2.getStatus());
                    } else {
                        num = null;
                    }
                    LJ = new C38281F0r(C246139lJ.LIZ(enumC246169lM, companion.of(num))).LJ();
                } else {
                    EnumC246169lM enumC246169lM2 = EnumC246169lM.MUSIC_TAB_BANNER;
                    User currUser = User.this;
                    o.LJIIIIZZ(currUser, "currUser");
                    LJ = new C38281F0r(C246139lJ.LIZIZ(enumC246169lM2, User.this)).LJ();
                }
                SmartRouter.buildRoute(C16880lQ.LLLLL(context), LJ).open();
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "others_homepage");
                c188727au.LJIIIZ("to_user_id", ((OriginMusicArg) this.LJLIL.getValue()).getUserId());
                User user = User.this;
                if (user == null || (str2 = C1DJ.LJIILJJIL(user)) == null) {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c188727au.LJIIIZ("status", str2);
                FMX.LJIIL("apply_music_tab_click", c188727au.LIZ);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, LLLZIIL);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "others_homepage");
        c188727au.LJIIIZ("to_user_id", ((OriginMusicArg) this.LJLIL.getValue()).getUserId());
        if (curUser == null || (str = C1DJ.LJIILJJIL(curUser)) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("status", str);
        FMX.LJIIL("apply_music_tab_show", c188727au.LIZ);
        AssemViewModel value = this.LJLJI.getValue();
        AssemViewModel.asyncSubscribe$default(value, new TBT() { // from class: X.9bP
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C239829b8 c239829b8 = (C239829b8) obj;
                c239829b8.getClass();
                return C208708Ha.LIZLLL(c239829b8);
            }
        }, null, new AqS170S0100000_4(LLLZIIL, 914), new AqS154S0100000_4(LLLZIIL, 1043), null, 18, null);
        C8YN.LJII(this, value, new TBT() { // from class: X.9az
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C239829b8 c239829b8 = (C239829b8) obj;
                c239829b8.getClass();
                return C208708Ha.LIZ(c239829b8);
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(LLLZIIL, 249), 4);
    }
}
