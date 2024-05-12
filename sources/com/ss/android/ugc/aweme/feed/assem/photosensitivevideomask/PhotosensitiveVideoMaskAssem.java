package com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask;

import X.C16880lQ;
import X.C213688a4;
import X.C214348b8;
import X.C220858ld;
import X.C240999d1;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8JG;
import X.C8JJ;
import X.C8JK;
import X.C8JL;
import X.C8JM;
import X.C8JQ;
import X.C8JR;
import X.C8JS;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.SY4;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import Y.ACListenerS38S0200000_3;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PhotosensitiveVideoMaskAssem extends FeedBaseAssem<PhotosensitiveVideoMaskAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIILZ;
    public final C5H3 LLFFF;
    public final C5H3 LLFII;
    public final InterfaceC115514g7 LLFZ;
    public TextView LLI;
    public TextView LLIFFJFJJ;
    public SY4 LLII;
    public SY4 LLIIII;

    static {
        TBT tbt = new TBT(PhotosensitiveVideoMaskAssem.class, "maskVM", "getMaskVM()Lcom/ss/android/ugc/aweme/feed/assem/photosensitivevideomask/PhotosensitiveVideoMaskVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIIILZ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        C8YN.LJII(this, p4(), new TBT() { // from class: X.8JT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C8JX) obj).LJLIL);
            }
        }, null, C8JK.LJLIL, 6);
        selectSubscribe(r1, new TBT() { // from class: X.8JY
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8JX) obj).LJLJI;
            }
        }, new TBT() { // from class: X.8JZ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8JX) obj).LJLILLLLZI;
            }
        }, new TBT() { // from class: X.8JU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C8JX) obj).LJLJJI);
            }
        }, new TBT() { // from class: X.8JV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C8JX) obj).LJLJJL);
            }
        }, C213688a4.LIZIZ(p4().usedInReusedScene), null, C8JM.LJLIL);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ab6;
    }

    public PhotosensitiveVideoMaskAssem() {
        new LinkedHashMap();
        this.LLFFF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C8JQ.INSTANCE);
        this.LLFII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C8JR.INSTANCE);
        C240999d1 c240999d1 = C240999d1.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PhotosensitiveVideoMaskVM.class);
        this.LLFZ = C214348b8.LIZ(this, LIZ, c240999d1, new AqS153S0100000_3(LIZ, 353), null, C8JS.INSTANCE, null, null);
    }

    public final PhotosensitiveVideoMaskVM p4() {
        return (PhotosensitiveVideoMaskVM) this.LLFZ.LIZ(this, LLIIIILZ[0]);
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        if (C220858ld.LJIIJ(item.getAweme())) {
            p4().kv0();
            return;
        }
        PhotosensitiveVideoMaskVM p4 = p4();
        p4.getClass();
        p4.withState(new AqS169S0100000_3(p4, 915));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        Y3().setVisibility(8);
        View findViewById = view.findViewById(R.id.bst);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.content)");
        this.LLI = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.title);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.title)");
        this.LLIFFJFJJ = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.b1h);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.button)");
        this.LLII = (SY4) findViewById3;
        View findViewById4 = view.findViewById(R.id.b1j);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.button1)");
        SY4 sy4 = (SY4) findViewById4;
        this.LLIIII = sy4;
        sy4.setText(R.string.jlq);
        C16880lQ.LJJIZ(sy4, new ACListenerS38S0200000_3(this, sy4, 33));
        SY4 sy42 = this.LLII;
        if (sy42 != null) {
            sy42.setText(R.string.jls);
            C16880lQ.LJJIZ(sy42, new ACListenerS23S0100000_3(this, 71));
            ((ImageView) view.findViewById(R.id.e_q)).setImageResource(R.drawable.ail);
            C8YN.LJIILJJIL(this, (AssemViewModel) this.LLFFF.getValue(), new TBT() { // from class: X.8JN
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C212208Um) obj).LJLIL;
                }
            }, C213688a4.LIZLLL(), C8JG.LJLIL, 4);
            C8YN.LJIILJJIL(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.8JO
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82B) obj).LJLIL;
                }
            }, null, C8JL.LJLIL, 6);
            C8YN.LJIILJJIL(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.8JP
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82B) obj).LJLJJI;
                }
            }, null, C8JJ.LJLIL, 6);
            return;
        }
        o.LJIJI("positiveBtn");
        throw null;
    }
}
