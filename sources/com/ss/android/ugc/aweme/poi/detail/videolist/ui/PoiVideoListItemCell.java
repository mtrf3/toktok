package com.ss.android.ugc.aweme.poi.detail.videolist.ui;

import X.C16880lQ;
import X.C188457aT;
import X.C190487dk;
import X.C190847eK;
import X.C191267f0;
import X.C191277f1;
import X.C191287f2;
import X.C191297f3;
import X.C191307f4;
import X.C191317f5;
import X.C1DI;
import X.C208458Gb;
import X.C214298b3;
import X.C221108m2;
import X.C43001GuD;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78939UyV;
import X.C8SG;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC207258Bl;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.W5F;
import X.W5U;
import X.YE1;
import Y.ACListenerS38S0200000_3;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiDetailInfoVAbility;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.experiment.PoiServerConfigSettings;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiVideoListItemCell extends PowerCell<C188457aT> {
    public SmartImageView LJLIL;
    public InterfaceC207258Bl LJLILLLLZI;
    public Boolean LJLJI;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 732));
    public final C214298b3 LJLJJL;

    public PoiVideoListItemCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiDetailInfoViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 738);
        C191297f3 c191297f3 = C191297f3.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C191277f1.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 739), new AqS153S0100000_3((InterfaceC93923mO) this, 740), C191317f5.INSTANCE, c191297f3, new AqS153S0100000_3((InterfaceC93923mO) this, 741), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C191287f2.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 742), new AqS153S0100000_3((InterfaceC93923mO) this, 733), C191307f4.INSTANCE, c191297f3, new AqS153S0100000_3((InterfaceC93923mO) this, 734), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C191267f0.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 735), new AqS153S0100000_3((InterfaceC93923mO) this, 736), new AqS153S0100000_3((InterfaceC93923mO) this, 737), c191297f3, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLJJL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LJLIL = (SmartImageView) this.itemView.findViewById(R.id.cover);
        View findViewById = this.itemView.findViewById(R.id.l74);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.thumbnail)");
        this.LJLILLLLZI = C8SG.LIZIZ.LJI((ViewGroup) findViewById);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        SmartImageView smartImageView;
        super.onViewAttachedToWindow();
        SmartImageView smartImageView2 = this.LJLIL;
        if (smartImageView2 != null) {
            smartImageView2.setAttached(true);
        }
        if (o.LJ(this.LJLJI, Boolean.TRUE) && (smartImageView = this.LJLIL) != null) {
            smartImageView.LJ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        SmartImageView smartImageView;
        super.onViewDetachedFromWindow();
        SmartImageView smartImageView2 = this.LJLIL;
        if (smartImageView2 != null) {
            smartImageView2.setAttached(false);
        }
        if (o.LJ(this.LJLJI, Boolean.TRUE) && (smartImageView = this.LJLIL) != null) {
            smartImageView.LJFF();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C188457aT c188457aT) {
        String str;
        Aweme aweme;
        Video video;
        SmartImageView smartImageView;
        IPoiDetailInfoVAbility iPoiDetailInfoVAbility;
        PoiListApi.PoiDetailResponse EO;
        Boolean bool;
        Integer num;
        C188457aT t = c188457aT;
        o.LJIIIZ(t, "t");
        String str2 = null;
        if (this.LJLJI == null) {
            Fragment LJIIIIZZ = C43001GuD.LJIIIIZZ(this);
            boolean z = false;
            if (LJIIIIZZ == null || (iPoiDetailInfoVAbility = (IPoiDetailInfoVAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LJIIIIZZ, null), IPoiDetailInfoVAbility.class, null)) == null || (EO = iPoiDetailInfoVAbility.EO()) == null || (bool = EO.haveRegionDiscovery) == null || !bool.booleanValue() || (num = PoiServerConfigSettings.LIZ().regionPoiDiscovery) == null || num.intValue() <= 0) {
                z = true;
            }
            this.LJLJI = Boolean.valueOf(z);
        }
        Aweme aweme2 = t.LJLILLLLZI;
        String str3 = t.LJLIL;
        if (str3 == null) {
            str3 = "";
        }
        int adapterPosition = getAdapterPosition();
        PoiListApi.PoiDetailResponse poiDetailResponse = ((PoiDetailInfoViewModel) this.LJLJJL.getValue()).LJLILLLLZI;
        if (poiDetailResponse != null) {
            str = poiDetailResponse.collectInfo;
        } else {
            str = null;
        }
        C190487dk c190487dk = (C190487dk) this.LJLJJI.getValue();
        if (c190487dk != null) {
            str2 = c190487dk.getFromGroupId();
        }
        C190847eK.LJ(adapterPosition, aweme2, str3, str, str2);
        C16880lQ.LJIIJ(new ACListenerS38S0200000_3(this, t, 86), this.itemView);
        InterfaceC207258Bl interfaceC207258Bl = this.LJLILLLLZI;
        if (interfaceC207258Bl != null) {
            interfaceC207258Bl.LIZIZ(t.LJLILLLLZI);
        }
        C188457aT item = getItem();
        if (item == null || (aweme = item.LJLILLLLZI) == null || (video = aweme.getVideo()) == null || (smartImageView = this.LJLIL) == null) {
            return;
        }
        Boolean bool2 = this.LJLJI;
        Boolean bool3 = Boolean.TRUE;
        if (C208458Gb.LIZJ(smartImageView, video, "PoiVideoListItem", o.LJ(bool2, bool3), 112)) {
            smartImageView.setAttached(true);
            if (!o.LJ(this.LJLJI, bool3)) {
                return;
            }
            smartImageView.LJ();
            return;
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(video.getCover()));
        LJII.LJJIIJ = smartImageView;
        C16880lQ.LLJJJ(LJII);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.c0u, viewGroup, false, "from(parent.context)\n   …videolist, parent, false)");
    }
}
