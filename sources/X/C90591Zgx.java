package X;

import Y.IDAListenerS240S0100000_24;
import Y.IDCListenerS136S0100000_24;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Zgx, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90591Zgx extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final LayoutInflater LJLILLLLZI;
    public final Drawable LJLJI;
    public final Drawable LJLJJI;
    public final Drawable LJLJJL;
    public final Drawable LJLJJLL;
    public ZXP LJLJL;
    public final int LJLJLJ;
    public final /* synthetic */ DialogC90863ZlL LJLL;
    public final ArrayList<ZXP> LJLIL = new ArrayList<>();
    public final Interpolator LJLJLLL = new AccelerateDecelerateInterpolator();

    public final void LJZ() {
        C90092ZXk c90092ZXk;
        ((ArrayList) this.LJLL.LJLL).clear();
        DialogC90863ZlL dialogC90863ZlL = this.LJLL;
        List<ZY4> list = dialogC90863ZlL.LJLL;
        List<ZY4> list2 = dialogC90863ZlL.LJLJLJ;
        ArrayList arrayList = new ArrayList();
        ZY2 zy2 = dialogC90863ZlL.LJLJJLL.LIZ;
        zy2.getClass();
        ZY5.LIZIZ();
        for (ZY4 zy4 : Collections.unmodifiableList(zy2.LIZIZ)) {
            ZY3 LIZ = dialogC90863ZlL.LJLJJLL.LIZ(zy4);
            if (LIZ != null && (c90092ZXk = LIZ.LIZ) != null && c90092ZXk.LIZLLL) {
                arrayList.add(zy4);
            }
        }
        HashSet hashSet = new HashSet(list2);
        hashSet.removeAll(arrayList);
        ((ArrayList) list).addAll(hashSet);
        notifyDataSetChanged();
    }

    public final void LJZI() {
        String str;
        AbstractC90599Zh5 abstractC90599Zh5;
        String str2;
        AbstractC90599Zh5 abstractC90599Zh52;
        this.LJLIL.clear();
        DialogC90863ZlL dialogC90863ZlL = this.LJLL;
        this.LJLJL = new ZXP(dialogC90863ZlL.LJLJJLL, 1);
        if (!((ArrayList) dialogC90863ZlL.LJLJL).isEmpty()) {
            Iterator it = ((ArrayList) this.LJLL.LJLJL).iterator();
            while (it.hasNext()) {
                this.LJLIL.add(new ZXP(it.next(), 3));
            }
        } else {
            this.LJLIL.add(new ZXP(this.LJLL.LJLJJLL, 3));
        }
        boolean z = false;
        if (!((ArrayList) this.LJLL.LJLJLJ).isEmpty()) {
            Iterator it2 = ((ArrayList) this.LJLL.LJLJLJ).iterator();
            boolean z2 = false;
            while (it2.hasNext()) {
                Object next = it2.next();
                if (!((ArrayList) this.LJLL.LJLJL).contains(next)) {
                    if (!z2) {
                        this.LJLL.LJLJJLL.getClass();
                        AbstractC90096ZXo abstractC90096ZXo = ZY5.LIZJ.LJIIZILJ;
                        if ((abstractC90096ZXo instanceof AbstractC90599Zh5) && (abstractC90599Zh52 = (AbstractC90599Zh5) abstractC90096ZXo) != null) {
                            str2 = abstractC90599Zh52.LJIIJ();
                        } else {
                            str2 = null;
                        }
                        if (TextUtils.isEmpty(str2)) {
                            str2 = this.LJLL.LJLLI.getString(R.string.b4);
                        }
                        this.LJLIL.add(new ZXP(str2, 2));
                        z2 = true;
                    }
                    this.LJLIL.add(new ZXP(next, 3));
                }
            }
        }
        if (!((ArrayList) this.LJLL.LJLJLLL).isEmpty()) {
            Iterator it3 = ((ArrayList) this.LJLL.LJLJLLL).iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                ZY4 zy4 = this.LJLL.LJLJJLL;
                if (zy4 != next2) {
                    if (!z) {
                        zy4.getClass();
                        AbstractC90096ZXo abstractC90096ZXo2 = ZY5.LIZJ.LJIIZILJ;
                        if ((abstractC90096ZXo2 instanceof AbstractC90599Zh5) && (abstractC90599Zh5 = (AbstractC90599Zh5) abstractC90096ZXo2) != null) {
                            str = abstractC90599Zh5.LJIIJJI();
                        } else {
                            str = null;
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = this.LJLL.LJLLI.getString(R.string.b5);
                        }
                        this.LJLIL.add(new ZXP(str, 2));
                        z = true;
                    }
                    this.LJLIL.add(new ZXP(next2, 4));
                }
            }
        }
        LJZ();
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size() + 1;
    }

    public C90591Zgx(DialogC90863ZlL dialogC90863ZlL) {
        this.LJLL = dialogC90863ZlL;
        this.LJLILLLLZI = C16880lQ.LLZIL(dialogC90863ZlL.LJLLI);
        this.LJLJI = ZXT.LJ(R.attr.aq, dialogC90863ZlL.LJLLI);
        this.LJLJJI = ZXT.LJ(R.attr.az, dialogC90863ZlL.LJLLI);
        this.LJLJJL = ZXT.LJ(R.attr.aw, dialogC90863ZlL.LJLLI);
        this.LJLJJLL = ZXT.LJ(R.attr.av, dialogC90863ZlL.LJLLI);
        this.LJLJLJ = dialogC90863ZlL.LJLLI.getResources().getInteger(R.integer.b);
        LJZI();
    }

    public final Drawable LJLZ(ZY4 zy4) {
        android.net.Uri uri = zy4.LJFF;
        if (uri != null) {
            try {
                Drawable createFromStream = Drawable.createFromStream(this.LJLL.LJLLI.getContentResolver().openInputStream(uri), null);
                if (createFromStream != null) {
                    return createFromStream;
                }
            } catch (IOException unused) {
            }
        }
        int i = zy4.LJIIL;
        if (i != 1) {
            if (i != 2) {
                if (zy4.LJ()) {
                    return this.LJLJJLL;
                }
                return this.LJLJI;
            }
            return this.LJLJJL;
        }
        return this.LJLJJI;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        ZXP zxp;
        if (i == 0) {
            zxp = this.LJLJL;
        } else {
            zxp = (ZXP) ListProtector.get(this.LJLIL, i - 1);
        }
        return zxp.LIZIZ;
    }

    @Override // X.AbstractC029409q
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        this.LJLL.LJZI.values().remove(viewHolder);
    }

    public final void LJLLLLLL(int i, View view) {
        ZXS zxs = new ZXS(i, view.getLayoutParams().height, view);
        zxs.setAnimationListener(new IDAListenerS240S0100000_24(this, 2));
        zxs.setDuration(this.LJLJLJ);
        zxs.setInterpolator(this.LJLJLLL);
        view.startAnimation(zxs);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ZXP zxp;
        boolean z;
        ZY3 LIZ;
        C90092ZXk c90092ZXk;
        boolean z2;
        float f;
        int itemViewType = getItemViewType(i);
        if (i == 0) {
            zxp = this.LJLJL;
        } else {
            zxp = (ZXP) ListProtector.get(this.LJLIL, i - 1);
        }
        boolean z3 = true;
        int i2 = 0;
        if (itemViewType != 1) {
            if (itemViewType != 2) {
                float f2 = 1.0f;
                if (itemViewType != 3) {
                    if (itemViewType != 4) {
                        return;
                    }
                    C90589Zgv c90589Zgv = (C90589Zgv) viewHolder;
                    c90589Zgv.getClass();
                    ZY4 zy4 = (ZY4) zxp.LIZ;
                    c90589Zgv.LJLJJLL = zy4;
                    c90589Zgv.LJLILLLLZI.setVisibility(0);
                    c90589Zgv.LJLJI.setVisibility(4);
                    List<ZY4> LIZIZ = c90589Zgv.LJLJL.LJLL.LJLJJLL.LIZIZ();
                    if (LIZIZ.size() == 1 && ListProtector.get(LIZIZ, 0) == zy4) {
                        z3 = false;
                    }
                    View view = c90589Zgv.LJLIL;
                    if (!z3) {
                        f2 = c90589Zgv.LJLJJL;
                    }
                    view.setAlpha(f2);
                    C16880lQ.LJIIJ(new IDCListenerS136S0100000_24(c90589Zgv, 8), c90589Zgv.LJLIL);
                    c90589Zgv.LJLILLLLZI.setImageDrawable(c90589Zgv.LJLJL.LJLZ(zy4));
                    c90589Zgv.LJLJJI.setText(zy4.LIZLLL);
                    return;
                }
                ((HashMap) this.LJLL.LJZI).put(((ZY4) zxp.LIZ).LIZJ, viewHolder);
                C90862ZlK c90862ZlK = (C90862ZlK) viewHolder;
                c90862ZlK.getClass();
                ZY4 zy42 = (ZY4) zxp.LIZ;
                if (zy42 == c90862ZlK.LJLLL.LJLL.LJLJJLL && zy42.LIZIZ().size() > 0) {
                    Iterator<ZY4> it = zy42.LIZIZ().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ZY4 next = it.next();
                        if (!((ArrayList) c90862ZlK.LJLLL.LJLL.LJLJLJ).contains(next)) {
                            zy42 = next;
                            break;
                        }
                    }
                }
                c90862ZlK.L(zy42);
                c90862ZlK.LJLJJLL.setImageDrawable(c90862ZlK.LJLLL.LJLZ(zy42));
                c90862ZlK.LJLJLJ.setText(zy42.LIZLLL);
                c90862ZlK.LJLL.setVisibility(0);
                boolean M = c90862ZlK.M(zy42);
                if (((ArrayList) c90862ZlK.LJLLL.LJLL.LJLL).contains(zy42) || ((c90862ZlK.M(zy42) && c90862ZlK.LJLLL.LJLL.LJLJJLL.LIZIZ().size() < 2) || (c90862ZlK.M(zy42) && ((LIZ = c90862ZlK.LJLLL.LJLL.LJLJJLL.LIZ(zy42)) == null || ((c90092ZXk = LIZ.LIZ) != null && !c90092ZXk.LIZJ))))) {
                    z = false;
                } else {
                    z = true;
                }
                c90862ZlK.LJLL.setChecked(M);
                c90862ZlK.LJLJL.setVisibility(4);
                c90862ZlK.LJLJJLL.setVisibility(0);
                c90862ZlK.LJLJJL.setEnabled(z);
                c90862ZlK.LJLL.setEnabled(z);
                ImageButton imageButton = c90862ZlK.LJLILLLLZI;
                if (z || M) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                imageButton.setEnabled(z2);
                C90572Zge c90572Zge = c90862ZlK.LJLJI;
                if (!z && !M) {
                    z3 = false;
                }
                c90572Zge.setEnabled(z3);
                C16880lQ.LJIIJ(c90862ZlK.LJLLJ, c90862ZlK.LJLJJL);
                c90862ZlK.LJLL.setOnClickListener(new ViewOnClickListenerC13880ga(c90862ZlK.LJLLJ));
                RelativeLayout relativeLayout = c90862ZlK.LJLJLLL;
                if (M && !c90862ZlK.LJLIL.LJ()) {
                    i2 = c90862ZlK.LJLLILLLL;
                }
                ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                layoutParams.height = i2;
                relativeLayout.setLayoutParams(layoutParams);
                View view2 = c90862ZlK.LJLJJL;
                if (z || M) {
                    f = 1.0f;
                } else {
                    f = c90862ZlK.LJLLI;
                }
                view2.setAlpha(f);
                CheckBox checkBox = c90862ZlK.LJLL;
                if (!z && M) {
                    f2 = c90862ZlK.LJLLI;
                }
                checkBox.setAlpha(f2);
                return;
            }
            C90590Zgw c90590Zgw = (C90590Zgw) viewHolder;
            c90590Zgw.getClass();
            c90590Zgw.LJLIL.setText(zxp.LIZ.toString());
            return;
        }
        ((HashMap) this.LJLL.LJZI).put(((ZY4) zxp.LIZ).LIZJ, viewHolder);
        C90861ZlJ c90861ZlJ = (C90861ZlJ) viewHolder;
        View view3 = c90861ZlJ.itemView;
        if (c90861ZlJ.LJLJL.LJLL.LJLJJLL.LIZIZ().size() > 1) {
            i2 = c90861ZlJ.LJLJJLL;
        }
        ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
        layoutParams2.height = i2;
        view3.setLayoutParams(layoutParams2);
        ZY4 zy43 = (ZY4) zxp.LIZ;
        c90861ZlJ.L(zy43);
        c90861ZlJ.LJLJJL.setText(zy43.LIZLLL);
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c90861ZlJ;
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        c90861ZlJ = null;
                    } else {
                        c90861ZlJ = new C90589Zgv(this, C16880lQ.LLLLIILL(this.LJLILLLLZI, R.layout.h, viewGroup, false));
                    }
                } else {
                    c90861ZlJ = new C90862ZlK(this, C16880lQ.LLLLIILL(this.LJLILLLLZI, R.layout.l, viewGroup, false));
                }
            } else {
                c90861ZlJ = new C90590Zgw(C16880lQ.LLLLIILL(this.LJLILLLLZI, R.layout.j, viewGroup, false));
            }
        } else {
            c90861ZlJ = new C90861ZlJ(this, C16880lQ.LLLLIILL(this.LJLILLLLZI, R.layout.i, viewGroup, false));
        }
        c90861ZlJ.itemView.setTag(R.id.lj7, Integer.valueOf(viewGroup.hashCode()));
        View view = c90861ZlJ.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c90861ZlJ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c90861ZlJ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c90861ZlJ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c90861ZlJ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c90861ZlJ.getClass().getName();
        return c90861ZlJ;
    }
}
