package com.ss.android.ugc.aweme.commercialize.feed.assem.tag;

import X.C04330Ez;
import X.C141335gf;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C32I;
import X.C3C5;
import X.C59942Nfm;
import X.C59944Nfo;
import X.C5H3;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C76800UCe;
import X.C7Z1;
import X.C8YN;
import X.KL2;
import X.TBT;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.commercialize.model.AdTagStruct;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdTopInteractInfoAreaTagAssem extends BaseCellSlotComponent<AdTopInteractInfoAreaTagAssem> {
    public final C62822Ol8 LLFII;
    public final C5H3 LLFZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.g3;
    }

    public AdTopInteractInfoAreaTagAssem() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS160S0100000_10(this, 84));
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C59944Nfo.INSTANCE);
    }

    public final C7Z1 q4() {
        return (C7Z1) this.LLFII.getValue();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        AwemeRawAd awemeRawAd;
        List<AdTagStruct> adTags;
        Object LIZ;
        Object LIZ2;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        C7Z1 q4 = q4();
        q4.removeAllViews();
        q4.LJLIL = 0;
        q4.LJLILLLLZI = 0;
        q4.setVisibility(0);
        Aweme aweme = item.getAweme();
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (adTags = awemeRawAd.getAdTags()) != null) {
            ArrayList arrayList = new ArrayList();
            for (AdTagStruct adTagStruct : adTags) {
                AdTagStruct adTagStruct2 = adTagStruct;
                if (adTagStruct2.getPosition() == 2 && !TextUtils.isEmpty(adTagStruct2.getTagText())) {
                    arrayList.add(adTagStruct);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AdTagStruct adTagStruct3 = (AdTagStruct) it.next();
                try {
                    LIZ = Integer.valueOf(Color.parseColor(adTagStruct3.getBackgroundColor()));
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                Integer valueOf = Integer.valueOf(C04330Ez.LIZIZ(q4().getContext(), R.color.b7));
                if (C3C5.m12isFailureimpl(LIZ)) {
                    LIZ = valueOf;
                }
                int intValue = ((Number) LIZ).intValue();
                try {
                    LIZ2 = Integer.valueOf(Color.parseColor(adTagStruct3.getTextColor()));
                    C3C5.m7constructorimpl(LIZ2);
                } catch (Throwable th2) {
                    LIZ2 = C141335gf.LIZ(th2);
                    C3C5.m7constructorimpl(LIZ2);
                }
                Integer valueOf2 = Integer.valueOf(C04330Ez.LIZIZ(q4().getContext(), R.color.bc));
                if (C3C5.m12isFailureimpl(LIZ2)) {
                    LIZ2 = valueOf2;
                }
                int intValue2 = ((Number) LIZ2).intValue();
                int LIZJ = (int) KL2.LIZJ(q4().getContext(), 5.0f);
                int LIZJ2 = (int) KL2.LIZJ(q4().getContext(), 2.5f);
                C7Z1 q42 = q4();
                String tagText = adTagStruct3.getTagText();
                String icon = adTagStruct3.getIcon();
                Object parent = getContainerView().getParent();
                o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                if (!q42.LIZ(intValue, tagText, intValue2, icon, ((View) parent).getWidth(), LIZJ, LIZJ2)) {
                    return;
                } else {
                    arrayList2.add(C76800UCe.LIZ);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(Object obj) {
        return c2((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* renamed from: m4 */
    public final boolean c2(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        return C63081OpJ.LJLI(item.getAweme());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.Nfn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, C213688a4.LJ(), C59942Nfm.LJLIL, 4);
    }
}
