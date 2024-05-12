package com.ss.android.ugc.aweme.detail.component.biz;

import X.C16880lQ;
import X.C221108m2;
import X.C224868s6;
import X.C28289B8j;
import X.C56593MIz;
import X.C62822Ol8;
import X.C81156VtA;
import X.M89;
import X.MEV;
import X.MEX;
import X.N4D;
import X.X1D;
import Y.ACListenerS29S0100000_9;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.commercialize.media.api.logging.ICommerceMusicLogger;
import com.ss.android.ugc.aweme.commercialize.media.impl.logging.CommerceMusicLogger;
import com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MusicBottomComponent extends ShootButtonBottomComponent {
    public boolean LJLJJLL;
    public Music LJLJL;
    public String LJLJLJ;
    public int LJLJLLL;
    public String LJLL;
    public Long LJLLI;
    public View LJLLILLLL;
    public TextView LJLLJ;
    public C81156VtA LJLLL;
    public TuxIconView LJLLLL;
    public View LJLLLLLL;
    public View LJLZ;
    public ShootExtraData LJZ;
    public Boolean LJZI = Boolean.TRUE;
    public final ICommerceMusicLogger LJZL = CommerceMusicLogger.LJJII();
    public final C62822Ol8 LL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 83));
    public final C62822Ol8 LLD = C221108m2.LIZIZ(new AqS159S0100000_9(this, 84));

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    public final int x3() {
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getABService();
        if (MEX.LIZIZ()) {
            return R.string.g0r;
        }
        return R.string.tie;
    }

    public final IFeedPanelPlatformAbility H3() {
        return (IFeedPanelPlatformAbility) this.LL.getValue();
    }

    public final void K3() {
        View view = this.LJLLILLLL;
        if (view != null) {
            view.setVisibility(0);
        }
        C81156VtA c81156VtA = this.LJLLL;
        if (c81156VtA != null) {
            c81156VtA.setVisibility(8);
        }
        View view2 = this.LJLJJI;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        TuxIconView tuxIconView = this.LJLLLL;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(8);
        }
        View view3 = this.LJLLLLLL;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        View view4 = this.LJLZ;
        if (view4 == null) {
            return;
        }
        view4.setVisibility(8);
    }

    public final void F3() {
        Aweme currentAweme;
        String str;
        IFeedPanelPlatformAbility H3 = H3();
        if (H3 == null || (currentAweme = H3.getCurrentAweme()) == null || currentAweme.getCcTemplateInfo() == null) {
            return;
        }
        M89 m89 = getPanelContext().LIZJ;
        if (m89 != null) {
            str = m89.getEventType();
        } else {
            str = null;
        }
        C224868s6.LIZ(getContext(), currentAweme, str, this.LJLJLJ);
    }

    public final boolean I3() {
        Aweme currentAweme;
        IFeedPanelPlatformAbility H3 = H3();
        if (H3 == null || (currentAweme = H3.getCurrentAweme()) == null || currentAweme.getAwemeType() != 65) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent, com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onCreate() {
        Bundle arguments;
        Music music;
        super.onCreate();
        Fragment fragment = getPanelContext().LJ;
        if (fragment == null || (arguments = fragment.getArguments()) == null) {
            return;
        }
        Serializable serializable = arguments.getSerializable("feed_data_music");
        if (serializable instanceof Music) {
            music = (Music) serializable;
        } else {
            music = null;
        }
        this.LJLJL = music;
        this.LJLJJLL = arguments.getBoolean("feed_data_is_ad", false);
        this.LJLJLJ = arguments.getString("id");
        arguments.getString("feed_data_author_id");
        this.LJLL = arguments.getString("previous_page", "");
        this.LJLJLLL = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 0);
        this.LJZ = (ShootExtraData) arguments.getParcelable("extra_shoot_data");
        N4D.LIZ.getClass();
        C56593MIz c56593MIz = N4D.LJI;
        this.LJLLI = Long.valueOf(arguments.getLong(c56593MIz.LIZ));
        M89 m89 = getPanelContext().LIZJ;
        if (m89 != null) {
            m89.setHideMusicText(true);
        }
        this.LJZI = Boolean.valueOf(arguments.getBoolean("music_data_from_cache", true));
        this.LJZL.LJIIJ(this.LJLJL);
        Long l = this.LJLLI;
        if (l != null && l.longValue() == 0) {
            return;
        }
        this.LJZL.LJII(c56593MIz, this.LJLLI);
    }

    @Override // X.C8W0
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLD.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.De0(new MEV(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    public final View C3(ViewGroup viewGroup) {
        String string;
        View LIZ = C28289B8j.LIZ(viewGroup, R.layout.alp, viewGroup, false);
        TuxIconView tuxIconView = (TuxIconView) LIZ.findViewById(R.id.gt3);
        this.LJLLLL = tuxIconView;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(0);
        }
        C81156VtA c81156VtA = (C81156VtA) LIZ.findViewById(R.id.d81);
        Music music = this.LJLJL;
        if (music != null) {
            o.LJIIIIZZ(c81156VtA, "this");
            Context context = getContext();
            if (context == null) {
                string = null;
            } else if (music.getMatchedPGCSoundInfo() != null && !TextUtils.isEmpty(music.getMatchedPGCSoundInfo().getMixedTitle())) {
                string = music.getMatchedPGCSoundInfo().getMixedTitle();
            } else if (!this.LJLJJLL && music.getMatchedPGCSoundInfo() != null && !TextUtils.isEmpty(music.getMatchedPGCSoundInfo().getShowInfo())) {
                string = context.getResources().getString(R.string.ij4, music.getMusicName(), music.getAuthorName());
            } else {
                Resources resources = context.getResources();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append('@');
                LIZ2.append(music.getAuthorName());
                string = resources.getString(R.string.ij4, music.getMusicName(), X1D.LIZIZ(LIZ2));
            }
            E3(c81156VtA, string);
        }
        this.LJLLL = c81156VtA;
        this.LJLLLLLL = LIZ.findViewById(R.id.gea);
        this.LJLZ = LIZ.findViewById(R.id.ge_);
        C81156VtA c81156VtA2 = (C81156VtA) LIZ.findViewById(R.id.gef);
        o.LJIIIIZZ(c81156VtA2, "this");
        E3(c81156VtA2, c81156VtA2.getResources().getString(R.string.ciu));
        View view = this.LJLZ;
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 12), view);
        }
        View view2 = this.LJLZ;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View findViewById = LIZ.findViewById(R.id.ap7);
        this.LJLLILLLL = findViewById;
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 13), findViewById);
        }
        this.LJLLJ = (TextView) LIZ.findViewById(R.id.b80);
        return LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f8  */
    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v3(android.view.View r36) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.component.biz.MusicBottomComponent.v3(android.view.View):void");
    }
}
