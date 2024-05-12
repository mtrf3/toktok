package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HwG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC45676HwG extends AbstractC029409q<C45680HwK> implements View.OnClickListener {
    public final ArrayList<C45678HwI> LJLIL;
    public final HashMap<String, C45678HwI> LJLILLLLZI;
    public final C0M5<MyMediaModel> LJLJI;
    public int LJLJJI;
    public final Context LJLJJL;
    public final LayoutInflater LJLJJLL;
    public final InterfaceC45689HwT LJLJL;
    public C45678HwI LJLJLJ;
    public C64691PaB LJLJLLL;
    public final String LJLL;
    public final boolean LJLLI;
    public boolean LJLLILLLL;

    public final C45678HwI LJZ() {
        if (this.LJLIL.size() > 0) {
            return (C45678HwI) ListProtector.get(this.LJLIL, 0);
        }
        return null;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return super.getItemViewType(i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C45678HwI c45678HwI = (C45678HwI) view.getTag();
        InterfaceC45689HwT interfaceC45689HwT = this.LJLJL;
        if (interfaceC45689HwT != null) {
            interfaceC45689HwT.LJIIZILJ(c45678HwI, true, this.LJLJJI, true);
            this.LJLJLJ = c45678HwI;
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C45680HwK c45680HwK, int i) {
        final MediaModel mediaModel;
        final C45680HwK c45680HwK2 = c45680HwK;
        C45678HwI c45678HwI = (C45678HwI) ListProtector.get(this.LJLIL, i);
        c45680HwK2.LJLIL.setTag(c45678HwI);
        c45680HwK2.LJLJI.setText(c45678HwI.LIZ);
        c45680HwK2.LJLJJI.setText(String.valueOf(((ArrayList) c45678HwI.LIZJ).size() + ((ArrayList) c45678HwI.LIZIZ).size()));
        if (((ArrayList) c45678HwI.LIZIZ).size() == 0 && ((ArrayList) c45678HwI.LIZJ).size() == 0) {
            return;
        }
        if (C32151Nz.LJJIIJZLJL(c45678HwI.LIZIZ)) {
            mediaModel = (MediaModel) ListProtector.get(c45678HwI.LIZJ, 0);
        } else {
            mediaModel = (MediaModel) ListProtector.get(c45678HwI.LIZIZ, 0);
        }
        if (mediaModel == null) {
            return;
        }
        C44687HgJ.LIZ(mediaModel.fileLocalUriPath, new InterfaceC44688HgK() { // from class: X.HwL
            @Override // X.InterfaceC44688HgK
            public final void LIZ(Object obj) {
                int i2;
                C45680HwK c45680HwK3 = C45680HwK.this;
                MediaModel mediaModel2 = mediaModel;
                c45680HwK3.getClass();
                if (obj != null && ((Boolean) obj).booleanValue()) {
                    if (c45680HwK3.LJLILLLLZI.getLayoutParams().width > 0) {
                        i2 = c45680HwK3.LJLILLLLZI.getLayoutParams().width;
                    } else {
                        i2 = -1;
                    }
                    C78764Uvg.LJIIJ(c45680HwK3.LJLILLLLZI, C44694HgQ.LJIIIIZZ(mediaModel2.fileLocalUriPath).toString(), i2, i2, Bitmap.Config.ARGB_4444, null, null);
                }
            }
        });
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C45680HwK com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View LLLLIILL = C16880lQ.LLLLIILL(this.LJLJJLL, R.layout.bd_, viewGroup, false);
        W5X w5x = (W5X) LLLLIILL.findViewById(R.id.f51);
        TextView textView = (TextView) LLLLIILL.findViewById(R.id.eho);
        TextView textView2 = (TextView) LLLLIILL.findViewById(R.id.egz);
        C45680HwK c45680HwK = new C45680HwK(LLLLIILL, w5x, textView, textView2);
        C16880lQ.LJIIJ(this, LLLLIILL);
        if (this.LJLLI) {
            LLLLIILL.setBackgroundColor(C79045V0n.LJ(R.attr.ca, this.LJLJJL).intValue());
            textView.setTextColor(C79045V0n.LJ(R.attr.dj, this.LJLJJL).intValue());
            textView2.setTextColor(C79045V0n.LJ(R.attr.dl, this.LJLJJL).intValue());
        }
        if (C58B.LIZ()) {
            w5x.getHierarchy().LJIL(V8L.LIZIZ(C32151Nz.LJIIZILJ(8)));
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
            c110614Vt.LIZJ = C61328O5c.LIZJ(8);
            w5x.setBackground(c110614Vt.LIZ(this.LJLJJL));
        }
        C0AX.LIZ(viewGroup, c45680HwK.itemView, R.id.lj7);
        View view = c45680HwK.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c45680HwK.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C45680HwK.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c45680HwK.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c45680HwK.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C45680HwK.class.getName();
        return c45680HwK;
    }

    public ViewOnClickListenerC45676HwG(Context context, InterfaceC45689HwT interfaceC45689HwT, boolean z) {
        ArrayList<C45678HwI> arrayList = new ArrayList<>();
        this.LJLIL = arrayList;
        this.LJLJI = new C0M5<>();
        this.LJLJLJ = null;
        this.LJLLI = false;
        this.LJLLILLLL = true;
        this.LJLJJL = context;
        this.LJLJJLL = C16880lQ.LLZIL(context);
        this.LJLJL = interfaceC45689HwT;
        C45678HwI c45678HwI = new C45678HwI();
        String string = context.getResources().getString(R.string.blg);
        this.LJLL = string;
        c45678HwI.LIZ = string;
        arrayList.add(c45678HwI);
        this.LJLILLLLZI = new HashMap<>();
        Iterator<C45678HwI> it = arrayList.iterator();
        while (it.hasNext()) {
            C45678HwI next = it.next();
            this.LJLILLLLZI.put(next.LIZ, next);
        }
        this.LJLLI = z;
    }

    public static void LJLLLLLL(C45678HwI c45678HwI, MyMediaModel myMediaModel, int i) {
        if (myMediaModel == null) {
            return;
        }
        if (i == 4) {
            ((ArrayList) c45678HwI.LIZJ).add(myMediaModel);
        } else if (i == 3) {
            ((ArrayList) c45678HwI.LIZIZ).add(myMediaModel);
        } else {
            if (i != 1) {
                return;
            }
            ((ArrayList) c45678HwI.LIZIZ).add(myMediaModel);
        }
    }

    public final void LJLZ(List<MyMediaModel> list, C45678HwI c45678HwI, HashSet<C45678HwI> hashSet, int i, AbstractC45692HwW abstractC45692HwW) {
        MyMediaModel LJ;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            MyMediaModel myMediaModel = (MyMediaModel) it.next();
            try {
                if (abstractC45692HwW == C45693HwX.LIZ) {
                    this.LJLJI.LJI(CastLongProtector.parseLong(myMediaModel.id), myMediaModel);
                } else if (this.LJLJI.LJIIIIZZ() > 0 && (LJ = this.LJLJI.LJ(CastLongProtector.parseLong(myMediaModel.id), null)) != null) {
                    this.LJLJI.LJII(CastLongProtector.parseLong(myMediaModel.id));
                    myMediaModel = LJ;
                }
            } catch (NumberFormatException unused) {
            }
            if (c45678HwI != null) {
                LJLLLLLL(c45678HwI, myMediaModel, i);
            }
            String str = myMediaModel.albumClass;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            C45678HwI c45678HwI2 = this.LJLILLLLZI.get(str);
            if (c45678HwI2 == null) {
                c45678HwI2 = new C45678HwI();
                c45678HwI2.LIZ = str;
                arrayList.add(c45678HwI2);
                this.LJLILLLLZI.put(str, c45678HwI2);
            }
            LJLLLLLL(c45678HwI2, myMediaModel, i);
            if (hashSet != null) {
                hashSet.add(c45678HwI2);
            }
        }
        this.LJLIL.addAll(arrayList);
        notifyDataSetChanged();
    }
}
