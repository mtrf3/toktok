package X;

import Y.ACListenerS20S0201000_2;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.69W, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C69W extends AbstractC029409q<C69Y> {
    public ArrayList<CaptionUtterance> LJLIL;
    public View LJLJI;
    public RecyclerView LJLJJI;
    public C69Z LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public int LJLILLLLZI = -1;
    public int LJLJLJ = -1;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public C69W(ArrayList<CaptionUtterance> arrayList) {
        this.LJLIL = arrayList;
    }

    public final void LJLLLLLL(int i) {
        int i2;
        RecyclerView.ViewHolder LJJIZ;
        if (i == -1 || i == (i2 = this.LJLILLLLZI)) {
            return;
        }
        this.LJLILLLLZI = i;
        RecyclerView recyclerView = this.LJLJJI;
        RecyclerView.ViewHolder viewHolder = null;
        if (recyclerView != null && recyclerView.LJJIZ(i2) != null) {
            RecyclerView recyclerView2 = this.LJLJJI;
            if (recyclerView2 != null) {
                viewHolder = recyclerView2.LJJIZ(i2);
            }
            o.LJII(viewHolder, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleAdapter.SubtitleViewHolder");
            ((C69Y) viewHolder).LJLIL.setTextColor(C5L7.LIZ().getResources().getColor(R.color.bg));
        }
        RecyclerView recyclerView3 = this.LJLJJI;
        if (recyclerView3 == null || (LJJIZ = recyclerView3.LJJIZ(i)) == null) {
            return;
        }
        ((C69Y) LJJIZ).LJLIL.setTextColor(C5L7.LIZ().getResources().getColor(R.color.ar));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("white highLightItem position=");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.LJLJJI = recyclerView;
    }

    public final void setData(List<CaptionUtterance> list) {
        ArrayList<CaptionUtterance> arrayList = new ArrayList<>();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            arrayList.add(new CaptionUtterance((CaptionUtterance) it.next()));
        }
        this.LJLIL = arrayList;
        notifyDataSetChanged();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C69Y c69y, final int i) {
        String str;
        C69Y p0 = c69y;
        o.LJIIIZ(p0, "p0");
        if (this.LJLILLLLZI == i) {
            p0.LJLIL.setTextColor(C5L7.LIZ().getResources().getColor(R.color.ar));
        } else {
            p0.LJLIL.setTextColor(C5L7.LIZ().getResources().getColor(R.color.bg));
        }
        p0.LJLIL.setVisibility(0);
        TextView textView = p0.LJLIL;
        TextStickerData textStickerData = ((CaptionUtterance) ListProtector.get(this.LJLIL, i)).inlineUtterance;
        if (textStickerData == null || (str = textStickerData.getTextStr()) == null) {
            Utterance utterance = ((CaptionUtterance) ListProtector.get(this.LJLIL, i)).utterance;
            if (utterance != null) {
                str = utterance.getText();
            } else {
                str = null;
            }
        }
        textView.setText(str);
        if (!TextUtils.isEmpty(p0.LJLIL.getText())) {
            p0.LJLIL.setOnTouchListener(new View.OnTouchListener() { // from class: X.69X
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getActionMasked() == 0) {
                        C69W.this.LJLJJLL = motionEvent.getX();
                        C69W.this.LJLJL = motionEvent.getY();
                        C69W.this.LJLJLJ = i;
                        return false;
                    }
                    return false;
                }
            });
            C16880lQ.LJIJI(p0.LJLIL, new ACListenerS20S0201000_2(i, this, p0, 4));
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C69Y com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        this.LJLJI = C1DI.LIZ(viewGroup, "p0", R.layout.cpi, viewGroup, false, "from(p0.context).inflate…subtitle_item, p0, false)");
        View view = this.LJLJI;
        if (view != null) {
            C69Y c69y = new C69Y(view);
            C0AX.LIZ(viewGroup, c69y.itemView, R.id.lj7);
            View view2 = c69y.itemView;
            if (view2 != null) {
                view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
            }
            try {
                if (c69y.itemView.getParent() != null) {
                    boolean z = true;
                    try {
                        SettingsManager.LIZLLL().getClass();
                        z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (z) {
                        StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                        stringBuffer.append(C69Y.class.getName());
                        stringBuffer.append(" parent ");
                        stringBuffer.append(viewGroup.getClass().getName());
                        stringBuffer.append(" viewType ");
                        stringBuffer.append(i);
                        C78983UzD.LJIILL(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) c69y.itemView.getParent();
                        if (viewGroup2 != null) {
                            C16880lQ.LJLLL(c69y.itemView, viewGroup2);
                        }
                    }
                }
            } catch (Exception e) {
                C78946Uyc.LIZIZ(e);
                C36922EeM.LIZ(e);
            }
            C29127Bbv.LIZ = C69Y.class.getName();
            return c69y;
        }
        o.LJIJI("view");
        throw null;
    }
}
