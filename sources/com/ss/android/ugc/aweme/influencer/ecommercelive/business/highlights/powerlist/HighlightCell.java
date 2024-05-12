package com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.powerlist;

import X.C16880lQ;
import X.C214298b3;
import X.C32151Nz;
import X.C44006HOw;
import X.C44008HOy;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72064SQa;
import X.C72065SQb;
import X.C72066SQc;
import X.C72067SQd;
import X.C72068SQe;
import X.C72069SQf;
import X.C79045V0n;
import X.C86V;
import X.C9BD;
import X.C9BE;
import X.C9G0;
import X.C9XN;
import X.EnumC72807Shn;
import X.InterfaceC65784Pro;
import X.KL2;
import X.O6R;
import X.ORZ;
import X.OUP;
import X.Q8U;
import X.S3I;
import X.S3L;
import X.W5F;
import X.W5U;
import X.X1D;
import X.YE1;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model.HighlightCard;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model.HighlightCellItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model.HighlightVideoInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.viewmodel.HighlightsListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class HighlightCell extends PowerCell<HighlightCard> {
    public final C214298b3 LJLIL;

    public HighlightCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(HighlightsListViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 701);
        C72067SQd c72067SQd = C72067SQd.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C72065SQb.INSTANCE, new AqS162S0100000_12(this, 702), new AqS162S0100000_12(this, 703), C72069SQf.INSTANCE, c72067SQd, new AqS162S0100000_12(this, 704), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C72066SQc.INSTANCE, new AqS162S0100000_12(this, 705), new AqS162S0100000_12(this, 696), C72068SQe.INSTANCE, c72067SQd, new AqS162S0100000_12(this, 697), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C72064SQa.INSTANCE, new AqS162S0100000_12(this, 698), new AqS162S0100000_12(this, 699), new AqS162S0100000_12(this, 700), c72067SQd, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(HighlightCard highlightCard) {
        String str;
        HighlightCellItem highlightCellItem;
        HighlightCellItem highlightCellItem2;
        HighlightCellItem highlightCellItem3;
        HighlightCellItem highlightCellItem4;
        HighlightVideoInfo videoInfo;
        String str2;
        HighlightCellItem highlightCellItem5;
        HighlightCellItem highlightCellItem6;
        HighlightCellItem highlightCellItem7;
        HighlightCellItem highlightCellItem8;
        HighlightVideoInfo videoInfo2;
        HighlightCard t = highlightCard;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        this.itemView.setBackgroundColor(0);
        if (o.LJ(t.isTopHighlight(), Boolean.TRUE)) {
            View findViewById = this.itemView.findViewById(R.id.lw4);
            o.LJIIIIZZ(findViewById, "itemView.tvDate");
            OUP.LJIJJLI(findViewById);
            String title = t.getTitle();
            if (title == null || title.length() == 0) {
                ((TextView) this.itemView.findViewById(R.id.lyc)).setText(C86V.LJFF(R.string.abd));
            } else {
                ((TextView) this.itemView.findViewById(R.id.lyc)).setText(t.getTitle());
            }
            HighlightsListViewModel highlightsListViewModel = (HighlightsListViewModel) this.LJLIL.getValue();
            List<HighlightCellItem> highlightItems = t.getHighlightItems();
            if (highlightItems != null && (highlightCellItem8 = (HighlightCellItem) ORZ.LJLLLLLL(0, highlightItems)) != null && (videoInfo2 = highlightCellItem8.getVideoInfo()) != null) {
                str2 = videoInfo2.getFragmentId();
            } else {
                str2 = null;
            }
            highlightsListViewModel.iv0(str2, true);
            List<HighlightCellItem> highlightItems2 = t.getHighlightItems();
            if (highlightItems2 != null) {
                highlightCellItem5 = (HighlightCellItem) ORZ.LJLLLLLL(0, highlightItems2);
            } else {
                highlightCellItem5 = null;
            }
            C9G0 c9g0 = (C9G0) this.itemView.findViewById(R.id.e8i);
            o.LJIIIIZZ(c9g0, "itemView.hvpVideoPreview1");
            L(highlightCellItem5, c9g0, true);
            List<HighlightCellItem> highlightItems3 = t.getHighlightItems();
            if (highlightItems3 != null) {
                highlightCellItem6 = (HighlightCellItem) ORZ.LJLLLLLL(1, highlightItems3);
            } else {
                highlightCellItem6 = null;
            }
            C9G0 c9g02 = (C9G0) this.itemView.findViewById(R.id.e8j);
            o.LJIIIIZZ(c9g02, "itemView.hvpVideoPreview2");
            L(highlightCellItem6, c9g02, true);
            List<HighlightCellItem> highlightItems4 = t.getHighlightItems();
            if (highlightItems4 != null) {
                highlightCellItem7 = (HighlightCellItem) ORZ.LJLLLLLL(2, highlightItems4);
            } else {
                highlightCellItem7 = null;
            }
            C9G0 c9g03 = (C9G0) this.itemView.findViewById(R.id.e8k);
            o.LJIIIIZZ(c9g03, "itemView.hvpVideoPreview3");
            L(highlightCellItem7, c9g03, true);
            return;
        }
        if (t.getGroupDate() != null) {
            ((TextView) this.itemView.findViewById(R.id.lw4)).setText(t.getGroupDate());
            View findViewById2 = this.itemView.findViewById(R.id.lw4);
            o.LJIIIIZZ(findViewById2, "itemView.tvDate");
            OUP.LJJLIIIJ(findViewById2);
        } else {
            ((TextView) this.itemView.findViewById(R.id.lw4)).setText("");
            View findViewById3 = this.itemView.findViewById(R.id.lw4);
            o.LJIIIIZZ(findViewById3, "itemView.tvDate");
            OUP.LJIJJLI(findViewById3);
        }
        String title2 = t.getTitle();
        if (title2 == null || title2.length() == 0) {
            ((TextView) this.itemView.findViewById(R.id.lyc)).setText(C86V.LJFF(R.string.abd));
        } else {
            ((TextView) this.itemView.findViewById(R.id.lyc)).setText(t.getTitle());
        }
        HighlightsListViewModel highlightsListViewModel2 = (HighlightsListViewModel) this.LJLIL.getValue();
        List<HighlightCellItem> highlightItems5 = t.getHighlightItems();
        if (highlightItems5 != null && (highlightCellItem4 = (HighlightCellItem) ORZ.LJLLLLLL(0, highlightItems5)) != null && (videoInfo = highlightCellItem4.getVideoInfo()) != null) {
            str = videoInfo.getFragmentId();
        } else {
            str = null;
        }
        highlightsListViewModel2.iv0(str, false);
        List<HighlightCellItem> highlightItems6 = t.getHighlightItems();
        if (highlightItems6 != null) {
            highlightCellItem = (HighlightCellItem) ORZ.LJLLLLLL(0, highlightItems6);
        } else {
            highlightCellItem = null;
        }
        C9G0 c9g04 = (C9G0) this.itemView.findViewById(R.id.e8i);
        o.LJIIIIZZ(c9g04, "itemView.hvpVideoPreview1");
        L(highlightCellItem, c9g04, false);
        List<HighlightCellItem> highlightItems7 = t.getHighlightItems();
        if (highlightItems7 != null) {
            highlightCellItem2 = (HighlightCellItem) ORZ.LJLLLLLL(1, highlightItems7);
        } else {
            highlightCellItem2 = null;
        }
        C9G0 c9g05 = (C9G0) this.itemView.findViewById(R.id.e8j);
        o.LJIIIIZZ(c9g05, "itemView.hvpVideoPreview2");
        L(highlightCellItem2, c9g05, false);
        List<HighlightCellItem> highlightItems8 = t.getHighlightItems();
        if (highlightItems8 != null) {
            highlightCellItem3 = (HighlightCellItem) ORZ.LJLLLLLL(2, highlightItems8);
        } else {
            highlightCellItem3 = null;
        }
        C9G0 c9g06 = (C9G0) this.itemView.findViewById(R.id.e8k);
        o.LJIIIIZZ(c9g06, "itemView.hvpVideoPreview3");
        L(highlightCellItem3, c9g06, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return inflateItemView(parent, R.layout.apn);
    }

    public final void L(HighlightCellItem highlightCellItem, C9G0 c9g0, boolean z) {
        long j;
        long j2;
        String text;
        Long length;
        String LIZIZ;
        String coverUrl;
        if (highlightCellItem == null) {
            KL2.LJIILLIIL(4, c9g0);
            return;
        }
        OUP.LJJLIIIJ(c9g0);
        HighlightVideoInfo videoInfo = highlightCellItem.getVideoInfo();
        if (videoInfo != null && (coverUrl = videoInfo.getCoverUrl()) != null) {
            W5F LJIIIIZZ = W5U.LJIIIIZZ(coverUrl);
            LJIIIIZZ.LJJIIJZLJL = (ImageView) c9g0.LIZ(R.id.ew8);
            LJIIIIZZ.LJIJJ = EnumC72807Shn.FIT_CENTER;
            Context context = c9g0.LIZ(R.id.ew8).getContext();
            o.LJIIIIZZ(context, "ivCover.context");
            Integer LJI = C79045V0n.LJI(R.attr.d7, context);
            if (LJI != null) {
                LJIIIIZZ.LJIILIIL = new ColorDrawable(LJI.intValue());
            }
            S3I s3i = new S3I();
            s3i.LIZLLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(4));
            LJIIIIZZ.LJIJJLI = new S3L(s3i);
            C16880lQ.LLJJJ(LJIIIIZZ);
        }
        HighlightVideoInfo videoInfo2 = highlightCellItem.getVideoInfo();
        if (videoInfo2 != null && (length = videoInfo2.getLength()) != null) {
            long longValue = length.longValue();
            long j3 = 60;
            long j4 = longValue / j3;
            if (j4 > 99) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(j4);
                String LLLZ = C16880lQ.LLLZ(":%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(longValue % j3)}, 2));
                o.LJIIIIZZ(LLLZ, "format(format, *args)");
                LIZ.append(LLLZ);
                LIZIZ = X1D.LIZIZ(LIZ);
            } else {
                LIZIZ = Q8U.LIZIZ(new Object[]{Long.valueOf(j4), Long.valueOf(longValue % j3)}, 2, "%02d:%02d", "format(format, *args)");
            }
            c9g0.setVideoDuration(LIZIZ);
        }
        HighlightVideoInfo videoInfo3 = highlightCellItem.getVideoInfo();
        if (videoInfo3 != null && (text = videoInfo3.getText()) != null) {
            c9g0.setVideoClicks(text);
        }
        String productCover = highlightCellItem.getProductCover();
        if (productCover != null) {
            W5F LJIIIIZZ2 = W5U.LJIIIIZZ(productCover);
            LJIIIIZZ2.LJJIIJZLJL = (ImageView) c9g0.LIZ(R.id.ewn);
            LJIIIIZZ2.LJIJJ = EnumC72807Shn.FIT_CENTER;
            Context context2 = c9g0.LIZ(R.id.ewn).getContext();
            o.LJIIIIZZ(context2, "ivProduct.context");
            Integer LJI2 = C79045V0n.LJI(R.attr.cj, context2);
            if (LJI2 != null) {
                LJIIIIZZ2.LJIILIIL = new ColorDrawable(LJI2.intValue());
            }
            S3I s3i2 = new S3I();
            s3i2.LIZLLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(4));
            LJIIIIZZ2.LJIJJLI = new S3L(s3i2);
            C16880lQ.LLJJJ(LJIIIIZZ2);
        }
        String productTitle = highlightCellItem.getProductTitle();
        if (productTitle != null) {
            c9g0.setProductSummary(productTitle);
        }
        C16880lQ.LJIIJ(new C44006HOw(this, z, highlightCellItem), c9g0);
        HighlightsListViewModel highlightsListViewModel = (HighlightsListViewModel) this.LJLIL.getValue();
        HighlightVideoInfo videoInfo4 = highlightCellItem.getVideoInfo();
        if (videoInfo4 == null || videoInfo4.getFragmentId() == null) {
            return;
        }
        if (z) {
            if (highlightsListViewModel.LJLJL.contains(highlightCellItem.getVideoInfo().getFragmentId())) {
                return;
            }
            String str = highlightsListViewModel.LJLILLLLZI;
            String str2 = highlightsListViewModel.LJLJI;
            Long length2 = highlightCellItem.getVideoInfo().getLength();
            if (length2 != null) {
                j2 = length2.longValue();
            } else {
                j2 = 0;
            }
            C44008HOy.LIZJ(j2, str, str2, highlightCellItem.getVideoInfo().getFragmentId(), highlightCellItem.getDaInfo(), z);
            highlightsListViewModel.LJLJL.add(highlightCellItem.getVideoInfo().getFragmentId());
            return;
        }
        if (highlightsListViewModel.LJLJJLL.contains(highlightCellItem.getVideoInfo().getFragmentId())) {
            return;
        }
        String str3 = highlightsListViewModel.LJLILLLLZI;
        String str4 = highlightsListViewModel.LJLJI;
        Long length3 = highlightCellItem.getVideoInfo().getLength();
        if (length3 != null) {
            j = length3.longValue();
        } else {
            j = 0;
        }
        C44008HOy.LIZJ(j, str3, str4, highlightCellItem.getVideoInfo().getFragmentId(), highlightCellItem.getDaInfo(), z);
        highlightsListViewModel.LJLJJLL.add(highlightCellItem.getVideoInfo().getFragmentId());
    }
}
