package X;

import Y.ACListenerS28S0201000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Sdz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72571Sdz extends AbstractC029409q<C72572Se0> {
    public final int LJLIL;
    public final ArrayList<C72587SeF> LJLILLLLZI;
    public final ArrayList<InterfaceC72696Sg0> LJLJI;
    public final int LJLJJI;
    public final InterfaceC72574Se2 LJLJJL;
    public final InterfaceC88472Yns<InterfaceC72575Se3, Boolean> LJLJJLL;
    public final InterfaceC88472Yns<InterfaceC72575Se3, Integer> LJLJL;
    public RecyclerView LJLJLJ;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJI.size() + this.LJLILLLLZI.size();
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.LJLJLJ = recyclerView;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C72572Se0 c72572Se0, int i) {
        InterfaceC72575Se3 interfaceC72575Se3;
        int i2;
        String string;
        C72572Se0 holder = c72572Se0;
        o.LJIIIZ(holder, "holder");
        if (i >= this.LJLILLLLZI.size()) {
            Object obj = ListProtector.get(this.LJLJI, i - this.LJLILLLLZI.size());
            o.LJIIIIZZ(obj, "{\n            effects[po…pirations.size]\n        }");
            interfaceC72575Se3 = (InterfaceC72575Se3) obj;
        } else {
            Object obj2 = ListProtector.get(this.LJLILLLLZI, i);
            o.LJIIIIZZ(obj2, "{\n            inspirations[position]\n        }");
            interfaceC72575Se3 = (InterfaceC72575Se3) obj2;
        }
        String thumbnail = interfaceC72575Se3.LIZIZ();
        boolean booleanValue = this.LJLJJLL.invoke(interfaceC72575Se3).booleanValue();
        int i3 = 0;
        if (interfaceC72575Se3.LIZ().LIZLLL() != null) {
            i2 = 2;
        } else if (!r5.LIZJ().isEmpty()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.LJLJJI == 1) {
            o.LJIIIZ(thumbnail, "thumbnail");
            View view = holder.LJLJJI;
            if (!booleanValue) {
                i3 = 8;
            }
            view.setVisibility(i3);
            Context context = holder.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            float LIZ = C44392HbY.LIZ(context, 22.0f);
            S3I s3i = new S3I();
            s3i.LIZ = true;
            s3i.LIZLLL = LIZ;
            S3L s3l = new S3L(s3i);
            holder.LJLJI.setCircleOptions(s3l);
            W5F LJIIIIZZ = W5U.LJIIIIZZ(thumbnail);
            LJIIIIZZ.LIZJ = holder.LJLJI.getContext();
            LJIIIIZZ.LJJIIJ = holder.LJLJI;
            LJIIIIZZ.LJIJJLI = s3l;
            C16880lQ.LLJJJ(LJIIIIZZ);
            C16880lQ.LJIIJ(new ACListenerS28S0201000_12(i, this, interfaceC72575Se3, 7), holder.itemView);
            return;
        }
        o.LJIIIZ(thumbnail, "thumbnail");
        if (booleanValue) {
            holder.LJLIL.setBackgroundResource(R.drawable.byr);
            View view2 = holder.LJLJJL;
            if (i2 == 0) {
                i3 = 8;
            }
            view2.setVisibility(i3);
            TuxTextView tuxTextView = holder.LJLJJLL;
            if (i2 != 1) {
                if (i2 != 2) {
                    string = null;
                } else {
                    string = holder.itemView.getResources().getString(R.string.c13);
                }
            } else {
                string = holder.itemView.getResources().getString(R.string.mt);
            }
            tuxTextView.setText(string);
        } else {
            holder.LJLIL.setBackgroundResource(0);
            holder.LJLJJL.setVisibility(8);
        }
        W5F LJIIIIZZ2 = W5U.LJIIIIZZ(thumbnail);
        LJIIIIZZ2.LIZJ = holder.LJLILLLLZI.getContext();
        LJIIIIZZ2.LJJIIJ = holder.LJLILLLLZI;
        C16880lQ.LLJJJ(LJIIIIZZ2);
        C16880lQ.LJIIJ(new ViewOnClickListenerC72573Se1(booleanValue, this, interfaceC72575Se3, i2, i), holder.itemView);
    }

    @Override // X.AbstractC029409q
    public final C72572Se0 onCreateViewHolder(ViewGroup parent, int i) {
        C72572Se0 c72572Se0;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (this.LJLJJI == 1) {
            int LJIIIIZZ = C60996Nwm.LJIIIIZZ(parent.getContext());
            c72572Se0 = new C72572Se0(C1FL.LIZIZ(parent, R.layout.c70, parent, false, "from(parent.context)\n   …list_item, parent, false)"));
            if (LJIIIIZZ < O6R.LJJIIZ(C32151Nz.LJIIZILJ(60)) * 6) {
                c72572Se0.itemView.getLayoutParams().width = C7MY.LIZIZ(47);
                c72572Se0.itemView.getLayoutParams().height = C7MY.LIZIZ(47);
                View view = c72572Se0.itemView;
                o.LJIIIIZZ(view, "holder.itemView");
                C26338AVi.LJIIIZ(view, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(1))), C1FJ.LIZIZ(1), C1FJ.LIZIZ(1), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(1))), 16);
            }
        } else {
            RecyclerView recyclerView = this.LJLJLJ;
            if (recyclerView != null) {
                int measuredWidth = recyclerView.getMeasuredWidth();
                int LIZIZ = C7MY.LIZIZ(12);
                int i2 = this.LJLIL;
                int i3 = (measuredWidth - ((i2 + 1) * LIZIZ)) / i2;
                View LIZ = C28289B8j.LIZ(parent, R.layout.c71, parent, false);
                LIZ.getLayoutParams().width = i3;
                LIZ.getLayoutParams().height = i3;
                c72572Se0 = new C72572Se0(LIZ);
            } else {
                o.LJIJI("mRecyclerView");
                throw null;
            }
        }
        C0AX.LIZ(parent, c72572Se0.itemView, R.id.lj7);
        View view2 = c72572Se0.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c72572Se0.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C72572Se0.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c72572Se0.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c72572Se0.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C72572Se0.class.getName();
        return c72572Se0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C72571Sdz(int i, ArrayList<C72587SeF> arrayList, ArrayList<InterfaceC72696Sg0> effects, int i2, InterfaceC72574Se2 listener, InterfaceC88472Yns<? super InterfaceC72575Se3, Boolean> interfaceC88472Yns, InterfaceC88472Yns<? super InterfaceC72575Se3, Integer> interfaceC88472Yns2) {
        o.LJIIIZ(effects, "effects");
        o.LJIIIZ(listener, "listener");
        this.LJLIL = i;
        this.LJLILLLLZI = arrayList;
        this.LJLJI = effects;
        this.LJLJJI = i2;
        this.LJLJJL = listener;
        this.LJLJJLL = interfaceC88472Yns;
        this.LJLJL = interfaceC88472Yns2;
    }
}
