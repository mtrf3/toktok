package com.ss.android.ugc.aweme.story.feed.immersive.dm;

import X.AnonymousClass391;
import X.C110614Vt;
import X.C16880lQ;
import X.C221108m2;
import X.C221138m5;
import X.C2IP;
import X.C2K0;
import X.C2U8;
import X.C55096Ljo;
import X.C61328O5c;
import X.C62822Ol8;
import X.C73411SrX;
import X.C73969T1h;
import X.C78596Usy;
import X.C8O4;
import X.C8TC;
import X.InterfaceC110994Xf;
import X.InterfaceC55102Lju;
import X.KR8;
import X.M89;
import X.T16;
import Y.ACListenerS23S0100000_3;
import Y.AfS50S0200000_1;
import Y.AfS55S0100000_3;
import Y.IDObjectS176S0100000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.ability.QuickDMEntranceAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryGestureEducationAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryQuickDMBottomBarAssem extends BaseCellSlotComponent implements InterfaceC110994Xf, QuickDMEntranceAbility, InterfaceC55102Lju {
    public Aweme LLFII;
    public String LLFZ;
    public String LLI;
    public C73411SrX LLIFFJFJJ;
    public final C221138m5 LLII;
    public final C62822Ol8 LLIIII;
    public final C62822Ol8 LLIIIILZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cp9;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -217498049) {
            return null;
        }
        return this;
    }

    public StoryQuickDMBottomBarAssem() {
        new LinkedHashMap();
        this.LLII = KR8.LJIIJJI(new AqS153S0100000_3(this, 978));
        this.LLIIII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 976));
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 977));
    }

    @Override // com.ss.android.ugc.aweme.story.ability.QuickDMEntranceAbility
    public final boolean D40() {
        if (!this.LJLLLL || Y3().getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final C8O4 a1() {
        return (C8O4) this.LLIIII.getValue();
    }

    @Override // X.InterfaceC110994Xf
    public final void ob() {
        C2U8.LIZ(new C2IP(true, false));
        StoryGestureEducationAbility storyGestureEducationAbility = (StoryGestureEducationAbility) this.LLII.getValue();
        if (storyGestureEducationAbility != null) {
            storyGestureEducationAbility.iO(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.ability.QuickDMEntranceAbility
    public final void YW() {
        Y3().performClick();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        String str;
        String str2;
        String str3;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        M89 m89 = (M89) this.LLIIIILZ.getValue();
        if (m89 != null) {
            str = C78596Usy.LJJIIZ(m89);
        } else {
            str = null;
        }
        this.LLFZ = str;
        M89 m892 = (M89) this.LLIIIILZ.getValue();
        if (m892 != null) {
            str2 = m892.getEventType();
        } else {
            str2 = null;
        }
        this.LLI = str2;
        Aweme aweme = this.LLFII;
        if (aweme != null) {
            str3 = aweme.getAuthorUid();
        } else {
            str3 = null;
        }
        if (o.LJ(str3, item.getAweme().getAuthorUid())) {
            this.LLFII = item.getAweme();
            return;
        }
        this.LLFII = item.getAweme();
        C73411SrX c73411SrX = this.LLIFFJFJJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LLIFFJFJJ = null;
        this.LLIFFJFJJ = (C73411SrX) C8TC.LIZIZ.LIZJ(item.getAweme()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS50S0200000_1(this, item, 17), new AfS55S0100000_3(this, 85));
    }

    @Override // X.InterfaceC110994Xf
    public final void Wb(String str) {
        ((TextView) Y3().findViewById(R.id.iks)).setText(str);
        C2U8.LIZ(new C2IP(false, false));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (view instanceof ViewGroup) {
            View findViewById = Y3().findViewById(R.id.ikr);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZJ = C61328O5c.LIZJ(24);
            c110614Vt.LJFF = Integer.valueOf(R.attr.dm);
            c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            findViewById.setBackground(c110614Vt.LIZ(context));
            ((TextView) Y3().findViewById(R.id.iks)).addTextChangedListener(new IDObjectS176S0100000_3(this, 8));
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 154), Y3());
            C16880lQ.LJJJJI((TuxTextView) Y3().findViewById(R.id.jof), new ACListenerS23S0100000_3(this, 155));
        }
    }
}
