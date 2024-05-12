package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.utils.Au2S17S0200000_9;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MFn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56503MFn extends C8HS<NewFaceStickerBean> {
    public C56503MFn() {
        super(false, 1, null);
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        List<NewFaceStickerBean> data = getData();
        o.LJI(data);
        Object obj = ListProtector.get(data, i);
        o.LJI(obj);
        NewFaceStickerBean newFaceStickerBean = (NewFaceStickerBean) obj;
        C56502MFm c56502MFm = (C56502MFm) holder;
        c56502MFm.LJLJL = newFaceStickerBean;
        c56502MFm.LJLILLLLZI.setText(newFaceStickerBean.name);
        c56502MFm.LJLJI.setText(newFaceStickerBean.ownerName);
        if (newFaceStickerBean.effectSource == 1) {
            C27740Aue.LJIIJ(true, c56502MFm.LJLJJI);
            TextView textView = c56502MFm.LJLJJI;
            if (textView != null) {
                textView.setText(R.string.pdt);
            }
        } else {
            C27740Aue.LJIIJ(false, c56502MFm.LJLJJI);
        }
        TextView textView2 = c56502MFm.LJLJJL;
        textView2.setText(textView2.getContext().getString(R.string.ij_, C77123UOp.LJJIIJ(newFaceStickerBean.userCount)));
        UrlModel urlModel = newFaceStickerBean.iconUrl;
        if (urlModel != null && urlModel.getUrlList() != null && !newFaceStickerBean.iconUrl.getUrlList().isEmpty()) {
            C78765Uvh.LJIIIZ(c56502MFm.LJLIL, (String) ListProtector.get(newFaceStickerBean.iconUrl.getUrlList(), 0), -1, -1);
        } else {
            C78765Uvh.LIZ(c56502MFm.LJLIL, R.drawable.bl9);
        }
        C16880lQ.LJIIJ(new Au2S17S0200000_9(c56502MFm, newFaceStickerBean, 2), c56502MFm.itemView);
        C16880lQ.LJIJJLI(c56502MFm.LJLJJLL, new Au2S17S0200000_9(c56502MFm, newFaceStickerBean, 3));
        c56502MFm.onShowItem();
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bbh, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        return new C56502MFm(view);
    }
}
