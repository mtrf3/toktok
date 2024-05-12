package X;

import Y.AObserverS71S0100000_3;
import Y.ARunnableS22S0200000_3;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.MissingFormatArgumentException;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.76X, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C76X extends AbstractC029409q<C178186z0> {
    public final Fragment LJLIL;
    public final ActivityC45651qj LJLILLLLZI;
    public final GiftViewModel LJLJI;
    public final String LJLJJI;
    public final C188487aW LJLJJL;
    public final boolean LJLJJLL;
    public GiftStruct[] LJLJL;
    public long LJLJLJ;
    public final LayoutInflater LJLJLLL;
    public final int LJLL;
    public int LJLLI;
    public final C62822Ol8 LJLLILLLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJL.length;
    }

    public final void LJLLLLLL(long j) {
        int i;
        long j2 = this.LJLJLJ;
        this.LJLJLJ = j;
        if (((Boolean) this.LJLLILLLL.getValue()).booleanValue()) {
            GiftStruct[] giftStructArr = this.LJLJL;
            int length = giftStructArr.length;
            int i2 = 0;
            while (true) {
                i = -1;
                if (i2 < length) {
                    GiftStruct giftStruct = giftStructArr[i2];
                    if (giftStruct != null && giftStruct.getId() == j2) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
            notifyItemChanged(i2);
            if (j != -1) {
                GiftStruct[] giftStructArr2 = this.LJLJL;
                int length2 = giftStructArr2.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length2) {
                        GiftStruct giftStruct2 = giftStructArr2[i3];
                        if (giftStruct2 != null && giftStruct2.getId() == j) {
                            i = i3;
                            break;
                        }
                        i3++;
                    } else {
                        break;
                    }
                }
                notifyItemChanged(i);
                return;
            }
            return;
        }
        notifyDataSetChanged();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C178186z0 c178186z0, int i) {
        List<String> list;
        String quantityString;
        String LIZIZ;
        List<String> urlList;
        String str;
        C178186z0 viewHolder = c178186z0;
        o.LJIIIZ(viewHolder, "viewHolder");
        GiftStruct giftStruct = this.LJLJL[i];
        long j = this.LJLJLJ;
        if (giftStruct != null) {
            viewHolder.LJLJLLL = giftStruct;
            UrlModel imageList = giftStruct.getImageList();
            if (imageList != null) {
                list = imageList.getUrlList();
            } else {
                list = null;
            }
            if (list != null && !list.isEmpty()) {
                View findViewById = viewHolder.itemView.findViewById(R.id.dtd);
                o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.gift_image)");
                SmartImageView smartImageView = (SmartImageView) findViewById;
                UrlModel imageList2 = giftStruct.getImageList();
                if (imageList2 != null && (urlList = imageList2.getUrlList()) != null && (str = (String) ORZ.LJLLLL(urlList)) != null) {
                    W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
                    LJIIIIZZ.LJJIIJ = smartImageView;
                    LJIIIIZZ.LJIJJ = EnumC72807Shn.CENTER_INSIDE;
                    C16880lQ.LLJJJ(LJIIIIZZ);
                }
            }
            View findViewById2 = viewHolder.LJLIL.findViewById(R.id.dsj);
            o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.gift_coin)");
            TextView textView = (TextView) findViewById2;
            try {
                LIZIZ = viewHolder.LJLJI.getResources().getQuantityString(R.plurals.uz, giftStruct.getDiamondCount(), Integer.valueOf(giftStruct.getDiamondCount()));
                o.LJIIIIZZ(LIZIZ, "{\n                contex…amondCount)\n            }");
            } catch (MissingFormatArgumentException unused) {
                if (giftStruct.getDiamondCount() <= 1) {
                    quantityString = viewHolder.LJLJI.getResources().getQuantityString(R.plurals.ul, 1, 1);
                } else {
                    quantityString = viewHolder.LJLJI.getResources().getQuantityString(R.plurals.ul, 2, 2);
                }
                o.LJIIIIZZ(quantityString, "if (giftStruct.diamondCo…  2, 2)\n                }");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(giftStruct.getDiamondCount());
                LIZ.append(' ');
                LIZ.append(quantityString);
                LIZIZ = X1D.LIZIZ(LIZ);
            }
            textView.setText(LIZIZ);
            View findViewById3 = viewHolder.LJLIL.findViewById(R.id.dtq);
            o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.id.gift_name)");
            TuxTextView tuxTextView = (TuxTextView) findViewById3;
            tuxTextView.setMinTextSize(10.0f);
            tuxTextView.setText(giftStruct.getName());
            if (giftStruct.getId() == j) {
                viewHolder.LJLIL.setBackgroundResource(R.drawable.xs);
            } else {
                viewHolder.LJLIL.setBackground(null);
                if (viewHolder.LJLJJLL == 3 && !viewHolder.LJLJJL.LJLLLL) {
                    viewHolder.itemView.postDelayed(new ARunnableS22S0200000_3(viewHolder, giftStruct, 78), 700L);
                }
            }
            viewHolder.LJLL = j;
            viewHolder.LJLIL.setVisibility(0);
            viewHolder.LJLLI = i;
        } else {
            viewHolder.LJLIL.setVisibility(4);
        }
        ((LiveData) this.LJLJI.LJLJJL.getValue()).setValue(Boolean.TRUE);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C178186z0 com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup vg, int i) {
        int i2;
        o.LJIIIZ(vg, "vg");
        View view = C16880lQ.LLLLIILL(this.LJLJLLL, R.layout.pt, null, false);
        o.LJIIIIZZ(view, "view");
        C178186z0 c178186z0 = new C178186z0(view, this.LJLIL, this.LJLILLLLZI, this.LJLJJI, this.LJLJI, this.LJLLI, this.LJLJJL, this.LJLJJLL);
        if (this.LJLJJLL) {
            i2 = 128;
        } else {
            i2 = 100;
        }
        C018905p c018905p = new C018905p(-1, C7MY.LIZIZ(i2));
        if (this.LJLJJLL) {
            ((ViewGroup.MarginLayoutParams) c018905p).topMargin = C7MY.LIZIZ(5);
            ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin = C7MY.LIZIZ(5);
            View view2 = c178186z0.itemView;
            o.LJIIIIZZ(view2, "viewHolder.itemView");
            OUP.LJJJJJL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(13)), view2);
        }
        c178186z0.itemView.setLayoutParams(c018905p);
        C0AX.LIZ(vg, c178186z0.itemView, R.id.lj7);
        View view3 = c178186z0.itemView;
        if (view3 != null) {
            view3.setTag(R.id.bq7, C79234V7u.LJIIIZ(vg));
        }
        try {
            if (c178186z0.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C178186z0.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(vg.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c178186z0.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c178186z0.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C178186z0.class.getName();
        return c178186z0;
    }

    public C76X(Fragment fragment, ActivityC45651qj context, GiftViewModel giftViewModel, String str, C188487aW giftRechargeDialogUtil, boolean z) {
        int i;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(giftViewModel, "giftViewModel");
        o.LJIIIZ(giftRechargeDialogUtil, "giftRechargeDialogUtil");
        this.LJLIL = fragment;
        this.LJLILLLLZI = context;
        this.LJLJI = giftViewModel;
        this.LJLJJI = str;
        this.LJLJJL = giftRechargeDialogUtil;
        this.LJLJJLL = z;
        this.LJLJL = new GiftStruct[0];
        this.LJLJLJ = -1L;
        this.LJLJLLL = C16880lQ.LLZIL(context);
        if (C1792271q.LIZ()) {
            i = 12;
        } else {
            i = 8;
        }
        this.LJLL = i;
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1734));
        giftViewModel.jv0().observe(context, new AObserverS71S0100000_3(this, 77));
    }
}
