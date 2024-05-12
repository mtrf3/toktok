package X;

import Y.ACListenerS27S0100000_7;
import Y.AObserverS71S0200000_7;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gsz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42925Gsz extends AbstractC26286ATi<List<? extends AnchorPublishStruct>> {
    public final LifecycleOwner LIZ;

    public C42925Gsz(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = lifecycleOwner;
    }

    @Override // X.AbstractC26286ATi
    public final void LIZ(Object items) {
        o.LJIIIZ(items, "items");
    }

    @Override // X.AbstractC26286ATi
    public final RecyclerView.ViewHolder LIZJ(ViewGroup viewGroup) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bi3, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        return new C42926Gt0(view, this.LIZ);
    }

    @Override // X.AbstractC26286ATi
    public final void LIZIZ(List<? extends AnchorPublishStruct> list, int i, RecyclerView.ViewHolder holder, List payloads) {
        C42926Gt0 c42926Gt0;
        float f;
        int i2;
        int i3;
        List<? extends AnchorPublishStruct> items = list;
        o.LJIIIZ(items, "items");
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        AnchorPublishStruct anchorItem = (AnchorPublishStruct) ListProtector.get(items, i);
        boolean z = holder instanceof C42926Gt0;
        if (z) {
            C42926Gt0 c42926Gt02 = (C42926Gt0) holder;
            o.LJIIIZ(anchorItem, "anchorItem");
            if (anchorItem.type == EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE()) {
                View view = c42926Gt02.LJLJLLL;
                try {
                    Keva keva = C66822jm.LIZ;
                    int i4 = keva.getInt("is_first_show_anchor_guild", -1);
                    if (i4 != -1 && i4 != 2) {
                        C79057V0z.LJJJJIZL(2, keva, "is_first_show_anchor_guild");
                        view.setBackgroundColor(view.getContext().getResources().getColor(R.color.cb));
                        view.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 0.1f);
                        ofFloat.setDuration(500L);
                        ofFloat.setRepeatCount(1);
                        ofFloat.setRepeatMode(2);
                        ofFloat.setStartDelay(500L);
                        ofFloat.setInterpolator(new LinearInterpolator());
                        ofFloat.start();
                    }
                } catch (Exception unused) {
                }
                if ((!C42921Gsv.LIZ() && anchorItem.extensionMisc.isImageMode()) || !anchorItem.enable) {
                    c42926Gt02.LJLJJI.setAlpha(0.34f);
                } else {
                    c42926Gt02.LJLJJI.setAlpha(1.0f);
                }
            } else {
                c42926Gt02.LJLJJI.setAlpha(1.0f);
            }
            if (anchorItem.type == EnumC42934Gt8.GET_LEADS.getTYPE() && !anchorItem.enable) {
                c42926Gt02.LJLJJI.setAlpha(0.34f);
            }
            if (anchorItem.type == EnumC42934Gt8.BA_PRODUCT_ANCHOR.getTYPE() && !anchorItem.enable) {
                f = 0.34f;
                c42926Gt02.LJLJJI.setAlpha(0.34f);
            } else {
                f = 0.34f;
            }
            if (anchorItem.type == EnumC42934Gt8.PAID_COLLECTION.getTYPE() && !anchorItem.enable) {
                c42926Gt02.LJLJJI.setAlpha(f);
            }
            if (anchorItem.type == EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE()) {
                anchorItem.extensionMisc.getExtensionDataRepo().getI18nStarAtlasClosed().observe(c42926Gt02.LJLIL, new AObserverS71S0200000_7(anchorItem, c42926Gt02, 5));
                if (!anchorItem.enable) {
                    c42926Gt02.LJLJJI.setAlpha(0.34f);
                }
            }
            TextView textView = c42926Gt02.LJLJJLL;
            if (anchorItem.isBeta) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView.setVisibility(i2);
            c42926Gt02.LJLJJLL.setText(R.string.ik);
            TextView textView2 = c42926Gt02.LJLJL;
            if (anchorItem.isNew) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            textView2.setVisibility(i3);
            c42926Gt02.LJLJL.setText(R.string.inl);
            String str = anchorItem.subtitle;
            if (str != null) {
                c42926Gt02.LJLJJL.setText(str);
            }
            C78765Uvh.LJFF(c42926Gt02.LJLILLLLZI, anchorItem.icon);
            if (anchorItem.type == 40) {
                c42926Gt02.LJLJI.setMaxEms(20);
            }
            c42926Gt02.LJLJI.setText(anchorItem.title);
            if (anchorItem.enable) {
                c42926Gt02.LJLJI.setTextColor(c42926Gt02.itemView.getContext().getResources().getColor(R.color.b5));
            } else {
                c42926Gt02.LJLJI.setTextColor(c42926Gt02.itemView.getContext().getResources().getColor(R.color.cr));
            }
            C16880lQ.LJIIJ(new ACListenerS27S0100000_7(anchorItem, 125), c42926Gt02.itemView);
        }
        if (i == items.size() - 1 && z && (c42926Gt0 = (C42926Gt0) holder) != null) {
            c42926Gt0.LJLJLJ.setVisibility(8);
        }
    }
}
