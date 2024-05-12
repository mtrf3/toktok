package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Zgq, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90584Zgq extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final ArrayList<ZXM> LJLIL = new ArrayList<>();
    public final LayoutInflater LJLILLLLZI;
    public final Drawable LJLJI;
    public final Drawable LJLJJI;
    public final Drawable LJLJJL;
    public final Drawable LJLJJLL;
    public final /* synthetic */ DialogC90860ZlI LJLJL;

    public final void LJLLLLLL() {
        this.LJLIL.clear();
        this.LJLIL.add(new ZXM(this.LJLJL.LJLJJL.getString(R.string.ap)));
        Iterator it = ((ArrayList) this.LJLJL.LJLJL).iterator();
        while (it.hasNext()) {
            this.LJLIL.add(new ZXM(it.next()));
        }
        notifyDataSetChanged();
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public C90584Zgq(DialogC90860ZlI dialogC90860ZlI) {
        this.LJLJL = dialogC90860ZlI;
        this.LJLILLLLZI = C16880lQ.LLZIL(dialogC90860ZlI.LJLJJL);
        this.LJLJI = ZXT.LJ(R.attr.aq, dialogC90860ZlI.LJLJJL);
        this.LJLJJI = ZXT.LJ(R.attr.az, dialogC90860ZlI.LJLJJL);
        this.LJLJJL = ZXT.LJ(R.attr.aw, dialogC90860ZlI.LJLJJL);
        this.LJLJJLL = ZXT.LJ(R.attr.av, dialogC90860ZlI.LJLJJL);
        LJLLLLLL();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return ((ZXM) ListProtector.get(this.LJLIL, i)).LIZIZ;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Drawable createFromStream;
        int itemViewType = getItemViewType(i);
        ZXM zxm = (ZXM) ListProtector.get(this.LJLIL, i);
        if (itemViewType != 1) {
            if (itemViewType != 2) {
                return;
            }
            C90583Zgp c90583Zgp = (C90583Zgp) viewHolder;
            c90583Zgp.getClass();
            ZY4 zy4 = (ZY4) zxm.LIZ;
            c90583Zgp.LJLIL.setVisibility(0);
            c90583Zgp.LJLJI.setVisibility(4);
            C16880lQ.LJIIJ(new ZXO(c90583Zgp, zy4), c90583Zgp.LJLIL);
            c90583Zgp.LJLJJI.setText(zy4.LIZLLL);
            ImageView imageView = c90583Zgp.LJLILLLLZI;
            C90584Zgq c90584Zgq = c90583Zgp.LJLJJL;
            c90584Zgq.getClass();
            android.net.Uri uri = zy4.LJFF;
            if (uri != null) {
                try {
                    createFromStream = Drawable.createFromStream(c90584Zgq.LJLJL.LJLJJL.getContentResolver().openInputStream(uri), null);
                } catch (IOException unused) {
                }
                if (createFromStream != null) {
                    imageView.setImageDrawable(createFromStream);
                    return;
                }
            }
            int i2 = zy4.LJIIL;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (zy4.LJ()) {
                        createFromStream = c90584Zgq.LJLJJLL;
                    } else {
                        createFromStream = c90584Zgq.LJLJI;
                    }
                } else {
                    createFromStream = c90584Zgq.LJLJJL;
                }
            } else {
                createFromStream = c90584Zgq.LJLJJI;
            }
            imageView.setImageDrawable(createFromStream);
            return;
        }
        C90582Zgo c90582Zgo = (C90582Zgo) viewHolder;
        c90582Zgo.getClass();
        c90582Zgo.LJLIL.setText(zxm.LIZ.toString());
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c90582Zgo;
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                c90582Zgo = null;
            } else {
                c90582Zgo = new C90583Zgp(this, C16880lQ.LLLLIILL(this.LJLILLLLZI, R.layout.s, viewGroup, false));
            }
        } else {
            c90582Zgo = new C90582Zgo(C16880lQ.LLLLIILL(this.LJLILLLLZI, R.layout.r, viewGroup, false));
        }
        c90582Zgo.itemView.setTag(R.id.lj7, Integer.valueOf(viewGroup.hashCode()));
        View view = c90582Zgo.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c90582Zgo.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c90582Zgo.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c90582Zgo.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c90582Zgo.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c90582Zgo.getClass().getName();
        return c90582Zgo;
    }
}
