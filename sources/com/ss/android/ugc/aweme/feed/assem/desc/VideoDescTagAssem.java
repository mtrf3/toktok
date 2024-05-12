package com.ss.android.ugc.aweme.feed.assem.desc;

import X.C182937Fx;
import X.C214348b8;
import X.C38891fp;
import X.C59948Nfs;
import X.C61845OOz;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C7MO;
import X.C7MY;
import X.C8F8;
import X.C8XO;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.feed.assem.desc.commerce.PromotedTagVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoDescTagAssem extends ReusedUIContentAssem<VideoDescTagAssem> implements C8XO<VideoItemParams> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLI;
    public TuxTextView LJZL;
    public TuxTag LL;
    public TuxTextView LLD;
    public C59948Nfs LLF;
    public C59948Nfs LLFF;
    public TuxTextView LLFFF;
    public final InterfaceC115514g7 LLFII;
    public final InterfaceC115514g7 LLFZ;

    static {
        TBT tbt = new TBT(VideoDescTagAssem.class, "promotedTagVM", "getPromotedTagVM()Lcom/ss/android/ugc/aweme/feed/assem/desc/commerce/PromotedTagVM;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(VideoDescTagAssem.class, "videoDescVM", "getVideoDescVM()Lcom/ss/android/ugc/aweme/feed/assem/desc/VideoDescVM;", 0, c65351Pkp)};
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public VideoDescTagAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(PromotedTagVM.class);
        this.LLFII = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 319), null, C7MO.INSTANCE, null, null);
        this.LLFZ = C38891fp.LJJIZ(this);
    }

    public final VideoDescVM Z3() {
        return (VideoDescVM) this.LLFZ.LIZ(this, LLI[1]);
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(VideoItemParams videoItemParams) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LJZL = (TuxTextView) C7MY.LIZLLL(view, "view", R.id.ibu, "view.findViewById(R.id.promoted_tag_tv)");
        View findViewById = view.findViewById(R.id.lj9);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.trans_promoted_tag_tv)");
        this.LL = (TuxTag) findViewById;
        View findViewById2 = view.findViewById(R.id.hgy);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.paid_partnership_tag_tv)");
        this.LLD = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.hgz);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.p…_partnership_tag_tv_grey)");
        this.LLF = (C59948Nfs) findViewById3;
        View findViewById4 = view.findViewById(R.id.e4w);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.h…transparency_tag_tv_grey)");
        this.LLFF = (C59948Nfs) findViewById4;
        View findViewById5 = view.findViewById(R.id.zl);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.aigc_content_label)");
        this.LLFFF = (TuxTextView) findViewById5;
        C8YN.LJIILLIIL(this, (AssemViewModel) this.LLFII.LIZ(this, LLI[0]), null, C8F8.LJLIL, 3);
        C8YN.LJIILLIIL(this, Z3(), null, C182937Fx.INSTANCE, 3);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(VideoItemParams videoItemParams) {
    }
}
