package X;

import Y.ACListenerS40S0200000_5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BG8 extends AbstractC029409q<BGA> {
    public final List<Hashtag> LJLIL;
    public Hashtag LJLILLLLZI;
    public final InterfaceC88472Yns<? super Hashtag, C76800UCe> LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(BGA bga, int i) {
        Long l;
        int i2;
        BGA holder = bga;
        o.LJIIIZ(holder, "holder");
        Hashtag hashtag = (Hashtag) ListProtector.get(this.LJLIL, i);
        Hashtag hashtag2 = this.LJLILLLLZI;
        if (hashtag2 != null) {
            l = hashtag2.id;
        } else {
            l = null;
        }
        boolean LJ = o.LJ(l, ((Hashtag) ListProtector.get(this.LJLIL, i)).id);
        BG9 bg9 = new BG9(this);
        o.LJIIIZ(hashtag, "hashtag");
        C15640jQ.LJII(holder.LJLIL, hashtag.image, R.drawable.cf6, 4);
        holder.LJLILLLLZI.setText(hashtag.title);
        holder.LJLILLLLZI.setSelected(LJ);
        C47121t6 c47121t6 = holder.LJLILLLLZI;
        if (LJ) {
            i2 = R.style.a45;
        } else {
            i2 = R.style.a43;
        }
        c47121t6.LJJIJIL(i2);
        C16880lQ.LJIIJ(new ACListenerS40S0200000_5(hashtag, bg9, 75), holder.itemView);
    }

    @Override // X.AbstractC029409q
    public final BGA onCreateViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        BGA bga = new BGA(C1FL.LIZIZ(parent, R.layout.dgc, parent, false, "from(parent.context).inf…htag_item, parent, false)"));
        C0AX.LIZ(parent, bga.itemView, R.id.lj7);
        View view = bga.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (bga.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(BGA.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) bga.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(bga.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = BGA.class.getName();
        return bga;
    }

    public BG8(List list, Hashtag hashtag, AqS171S0100000_5 onHashTagItemSelected) {
        o.LJIIIZ(onHashTagItemSelected, "onHashTagItemSelected");
        this.LJLIL = list;
        this.LJLILLLLZI = hashtag;
        this.LJLJI = onHashTagItemSelected;
    }
}
