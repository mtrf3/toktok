package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.S1i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71422S1i implements InterfaceC71425S1l {
    public TuxTextView LIZ;
    public TuxTextView LIZIZ;

    @Override // X.InterfaceC71425S1l
    public final boolean LIZ(C71419S1f anchor) {
        o.LJIIIZ(anchor, "anchor");
        return false;
    }

    @Override // X.InterfaceC71425S1l
    public final void LIZIZ(Aweme aweme, C71419S1f anchor, S1U poiAnchorMaker) {
        String str;
        String LIZ;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(anchor, "anchor");
        o.LJIIIZ(poiAnchorMaker, "poiAnchorMaker");
        this.LIZ = (TuxTextView) anchor.findViewById(R.id.hug);
        this.LIZIZ = (TuxTextView) anchor.findViewById(R.id.bm_);
        TuxTextView tuxTextView = this.LIZ;
        String str2 = null;
        if (tuxTextView != null) {
            PoiAnchorData poiAnchorData = anchor.LJLJI.LJLILLLLZI;
            if (poiAnchorData != null) {
                str = poiAnchorData.getPoiName();
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
        TuxTextView tuxTextView2 = this.LIZIZ;
        if (tuxTextView2 == null) {
            return;
        }
        if (C78685UuP.LJJJZ(anchor.LIZJ())) {
            String LIZJ = anchor.LIZJ();
            PoiAnchorData poiAnchorData2 = anchor.LJLJI.LJLILLLLZI;
            if (poiAnchorData2 != null) {
                str2 = poiAnchorData2.getPoiName();
            }
            if (!o.LJ(LIZJ, str2)) {
                LIZ = anchor.LIZJ();
                tuxTextView2.setText(LIZ);
            }
        }
        LIZ = anchor.LJLJI.LIZ(Q7K.LIZIZ("comment_poi_video_count_threshold", 100));
        tuxTextView2.setText(LIZ);
    }
}
