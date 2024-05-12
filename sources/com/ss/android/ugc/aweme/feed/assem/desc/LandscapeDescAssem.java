package com.ss.android.ugc.aweme.feed.assem.desc;

import X.ActivityC45651qj;
import X.AnonymousClass859;
import X.C16880lQ;
import X.C2055084s;
import X.C2055184t;
import X.C212428Vi;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C7MY;
import X.C85C;
import X.C85F;
import X.C85G;
import X.C8YN;
import X.C9XU;
import X.G27;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class LandscapeDescAssem extends FeedBaseAssem<LandscapeDescAssem> implements G27 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIJ;
    public final InterfaceC115514g7 LLFFF;
    public final C5H3 LLFII;
    public C85C LLFZ;
    public final C62822Ol8 LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public C2055184t LLII;
    public final int LLIIII;
    public final int LLIIIILZ;

    static {
        TBT tbt = new TBT(LandscapeDescAssem.class, "videoDescVM", "getVideoDescVM()Lcom/ss/android/ugc/aweme/feed/assem/desc/LandscapeVideoDescVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIIJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.bh0;
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
    }

    public LandscapeDescAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(LandscapeVideoDescVM.class);
        this.LLFFF = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 309), null, C85F.INSTANCE, null, null);
        this.LLFII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C85G.INSTANCE);
        this.LLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 308));
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 307));
        this.LLIIII = C7MY.LIZIZ(2);
        this.LLIIIILZ = C7MY.LIZIZ(7);
    }

    public final TuxTextView p4() {
        return (TuxTextView) this.LLI.getValue();
    }

    public final LandscapeVideoDescVM q4() {
        return (LandscapeVideoDescVM) this.LLFFF.LIZ(this, LLIIIJ[0]);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem, X.C8XO
    public final void LLLZIIL() {
        q4().LJLJLLL.LIZIZ(LandscapeVideoDescVM.LJZI[0], null);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem, X.C8XO
    public final /* bridge */ /* synthetic */ void n3(VideoItemParams videoItemParams) {
        n3(videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem
    /* renamed from: n4 */
    public final void n3(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        LandscapeVideoDescVM q4 = q4();
        q4.LJLJLLL.LIZIZ(LandscapeVideoDescVM.LJZI[0], getContext());
        this.LLFZ = item.videoCellDescAbility;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        LandscapeVideoDescVM q4 = q4();
        TuxTextView descToggle = p4();
        o.LJIIIIZZ(descToggle, "descToggle");
        C2055184t c2055184t = new C2055184t(q4, descToggle, getContext());
        this.LLII = c2055184t;
        c2055184t.LIZ(view);
        C2055184t c2055184t2 = this.LLII;
        if (c2055184t2 != null) {
            c2055184t2.LIZJ();
        }
        if (q4().LJLZ) {
            p4().setVisibility(8);
        } else {
            C16880lQ.LJJJJI(p4(), new ACListenerS23S0100000_3(this, 62));
        }
        if (((Boolean) q4().LJLL.getValue()).booleanValue()) {
            p4().setTuxFont(82);
        }
        C8YN.LJII(this, q4(), new TBT() { // from class: X.85K
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AnonymousClass851) obj).LJLIL;
            }
        }, C213688a4.LIZJ(), C2055084s.LJLIL, 4);
        C8YN.LJII(this, q4(), new TBT() { // from class: X.85O
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AnonymousClass851) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZJ(), AnonymousClass859.LJLIL, 4);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C9XU.LIZIZ(LIZ, this);
        }
    }
}
