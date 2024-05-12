package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextEffectExtra;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wmb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83297Wmb extends AbstractC029409q<C83298Wmc> {
    public final List<C157776Hd> LJLIL;
    public final C6I2<C157776Hd> LJLILLLLZI;
    public final C6I2<C157916Hr> LJLJI;
    public final InterfaceC88472Yns<C157776Hd, C76800UCe> LJLJJI;
    public int LJLJJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C83298Wmc c83298Wmc, int i) {
        boolean z;
        boolean z2;
        EnumC83299Wmd enumC83299Wmd;
        C83298Wmc viewHolder = c83298Wmc;
        o.LJIIIZ(viewHolder, "viewHolder");
        if (this.LJLIL.size() > i) {
            C157776Hd c157776Hd = (C157776Hd) ListProtector.get(viewHolder.LJLJJL.LJLIL, i);
            EffectTextEffectExtra effectTextEffectExtra = c157776Hd.LJLJI;
            if (effectTextEffectExtra.LJLIL) {
                C78764Uvg.LIZ(viewHolder.LJLIL.getImageView(), R.drawable.azl);
            } else if (effectTextEffectExtra.ifStandard) {
                C78764Uvg.LIZ(viewHolder.LJLIL.getImageView(), R.drawable.azm);
            } else {
                UrlModel urlModel = new UrlModel();
                com.ss.android.ugc.effectmanager.common.model.UrlModel iconUrl = c157776Hd.effect.getIconUrl();
                urlModel.setUri(iconUrl.getUri());
                urlModel.setUrlList(iconUrl.getUrlList());
                C78764Uvg.LJI(viewHolder.LJLIL.getImageView(), urlModel, -1, -1);
            }
            viewHolder.LJLIL.setText(c157776Hd.effect.getName());
            viewHolder.LJLIL.getImageView().setBackgroundResource(R.drawable.at2);
            TDG tdg = viewHolder.LJLIL;
            if (viewHolder.getAdapterPosition() == viewHolder.LJLJJL.LJLJJL) {
                z = true;
            } else {
                z = false;
            }
            tdg.setCustomSelected(z);
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(viewHolder.LJLJJL.LJLILLLLZI.LIZ(c157776Hd)));
            java.util.Set<C157916Hr> set = c157776Hd.LJLILLLLZI;
            C83297Wmb c83297Wmb = viewHolder.LJLJJL;
            Iterator<C157916Hr> it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(c83297Wmb.LJLJI.LIZ(it.next())));
            }
            C83302Wmg c83302Wmg = EnumC83299Wmd.Companion;
            int LJJJJL = C45804HyK.LJJJJL(arrayList);
            c83302Wmg.getClass();
            if (LJJJJL == 8) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                enumC83299Wmd = EnumC83299Wmd.DOWNLOADING;
            } else if (LJJJJL == 2 || LJJJJL == 1 || LJJJJL == 32) {
                enumC83299Wmd = EnumC83299Wmd.NOT_DOWNLOAD;
            } else if (LJJJJL == 4 || LJJJJL == 16) {
                enumC83299Wmd = EnumC83299Wmd.DOWNLOADED;
            } else {
                enumC83299Wmd = EnumC83299Wmd.NOT_DOWNLOAD;
            }
            viewHolder.LJLJI = enumC83299Wmd;
            int i2 = C83300Wme.LIZ[enumC83299Wmd.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        viewHolder.LJLILLLLZI.setVisibility(0);
                        viewHolder.L();
                        return;
                    }
                    viewHolder.LJLILLLLZI.setVisibility(0);
                    viewHolder.LJLILLLLZI.setImageResource(R.drawable.azk);
                    Object value = viewHolder.LJLJJI.getValue();
                    o.LJIIIIZZ(value, "<get-downloadAnimator>(...)");
                    ((ObjectAnimator) value).start();
                    return;
                }
                viewHolder.LJLILLLLZI.setVisibility(8);
                viewHolder.L();
                return;
            }
            viewHolder.LJLILLLLZI.setVisibility(0);
            viewHolder.L();
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C83298Wmc com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.au4, viewGroup, false);
        Context context = LIZIZ.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        AqS180S0100000_14 aqS180S0100000_14 = new AqS180S0100000_14(LIZIZ, 299);
        C83301Wmf c83301Wmf = new C83301Wmf(context);
        aqS180S0100000_14.invoke(c83301Wmf);
        C74274TDa c74274TDa = new C74274TDa(context, c83301Wmf.LIZ, c83301Wmf.LIZIZ, c83301Wmf.LIZJ, c83301Wmf.LIZLLL, c83301Wmf.LJ, 4, 4, R.color.c7, true, c83301Wmf.LJFF, 2, R.color.c7, R.color.c0, 2);
        if (C82852WfQ.LIZ().LJFF) {
            TextView textView = c74274TDa.getTextView();
            if (textView != null) {
                textView.setTextSize(12.0f);
            }
            TextView textView2 = c74274TDa.getTextView();
            if (textView2 != null) {
                C78880UxY.LJLIIL(textView2);
            }
        } else {
            TextView textView3 = c74274TDa.getTextView();
            if (textView3 != null) {
                textView3.setTextSize(11.0f);
            }
            TextView textView4 = c74274TDa.getTextView();
            if (textView4 != null) {
                textView4.setTypeface(Typeface.defaultFromStyle(0));
            }
        }
        c74274TDa.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        c74274TDa.setId(R.id.f2p);
        ((ViewGroup) LIZIZ.findViewById(R.id.ddt)).addView(c74274TDa, 0);
        C83298Wmc c83298Wmc = new C83298Wmc(this, LIZIZ);
        C0AX.LIZ(viewGroup, c83298Wmc.itemView, R.id.lj7);
        View view = c83298Wmc.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c83298Wmc.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C83298Wmc.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c83298Wmc.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c83298Wmc.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C83298Wmc.class.getName();
        return c83298Wmc;
    }

    public C83297Wmb(List list, C6I1 textDownloader, C6I1 fontDownloader, AqS168S0100000_2 aqS168S0100000_2) {
        o.LJIIIZ(textDownloader, "textDownloader");
        o.LJIIIZ(fontDownloader, "fontDownloader");
        this.LJLIL = list;
        this.LJLILLLLZI = textDownloader;
        this.LJLJI = fontDownloader;
        this.LJLJJI = aqS168S0100000_2;
        this.LJLJJL = -1;
    }
}
