package X;

import Y.ACListenerS40S0200000_5;
import Y.IDcS8S0200000_5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastImageCacheRefactorSetting;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BMv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28665BMv extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final InterfaceC88472Yns<? super RoomSticker, C76800UCe> LJLIL;
    public final List<RoomSticker> LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;

    public final int LJZ() {
        int i = 0;
        Iterator it = ((LinkedHashMap) C113554cx.LJJLIIIIJ(new OSZ("TEXT", Integer.valueOf(this.LJLJI)), new OSZ("IMAGE", Integer.valueOf(this.LJLJJI)), new OSZ("SPECIAL", Integer.valueOf(this.LJLJJL)))).entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((Number) entry.getValue()).intValue() > 0) {
                i = ((Number) entry.getValue()).intValue();
                break;
            }
        }
        return i + 1;
    }

    public final int LJLZ() {
        int i;
        int i2;
        int i3 = 1;
        if (this.LJLJI != 0) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.LJLJJI != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i4 = i2 + i;
        if (this.LJLJJL == 0) {
            i3 = 0;
        }
        return i3 + i4;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return LJLZ() + ((ArrayList) this.LJLILLLLZI).size();
    }

    public C28665BMv(AqS171S0100000_5 onStickerItemSelected) {
        o.LJIIIZ(onStickerItemSelected, "onStickerItemSelected");
        this.LJLIL = onStickerItemSelected;
        this.LJLILLLLZI = new ArrayList();
    }

    public final int LJLLLLLL(int i) {
        int i2 = 1;
        if (getItemViewType(i) != 1) {
            if (LJLZ() >= 3) {
                int i3 = this.LJLJI;
                int i4 = this.LJLJJI;
                if (i > ((i3 + i4) + 2) - 2) {
                    i2 = i3 + 3 + i4;
                    return i - i2;
                }
            }
            if (LJLZ() >= 2 && i > LJZ() - 1) {
                i2 = this.LJLJI + 2;
            } else if (LJLZ() < 1 || i <= 0) {
                i2 = 0;
            }
            return i - i2;
        }
        return -1;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        int LJLZ = LJLZ();
        if (LJLZ == 1 ? i != 0 : LJLZ == 2 ? !(i == 0 || i == LJZ()) : !(LJLZ == 3 && (i == 0 || i == LJZ() || i == this.LJLJI + this.LJLJJI + 2))) {
            if (this.LJLJI == 0 || i >= LJZ()) {
                return 3;
            }
            return 2;
        }
        return 1;
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).LLJLILLLLZIIL(new IDcS8S0200000_5(this, layoutManager, 0));
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        int i2;
        int i3;
        List list;
        int i4;
        boolean z;
        boolean z2;
        String title;
        o.LJIIIZ(holder, "holder");
        int i5 = 0;
        boolean z3 = false;
        i5 = 0;
        if (holder instanceof C28666BMw) {
            if (i == this.LJLJI + this.LJLJJI + 2) {
                i4 = 3;
            } else if (i == LJZ()) {
                i4 = 2;
            } else if (i == 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            C28666BMw c28666BMw = (C28666BMw) holder;
            OSZ[] oszArr = new OSZ[3];
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.k0z);
            if (this.LJLJI != 0) {
                z = true;
            } else {
                z = false;
            }
            oszArr[0] = new OSZ(LJIILJJIL, Boolean.valueOf(z));
            String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.k0x);
            if (this.LJLJJI != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            oszArr[1] = new OSZ(LJIILJJIL2, Boolean.valueOf(z2));
            String LJIILJJIL3 = C15380j0.LJIILJJIL(R.string.k0y);
            if (this.LJLJJL != 0) {
                z3 = true;
            }
            oszArr[2] = new OSZ(LJIILJJIL3, Boolean.valueOf(z3));
            java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
            if (i4 >= 1) {
                for (Map.Entry entry : ((LinkedHashMap) LJJLIIIIJ).entrySet()) {
                    if (((Boolean) entry.getValue()).booleanValue()) {
                        if (i4 == 1) {
                            title = (String) entry.getKey();
                            break;
                        }
                        i4--;
                    }
                }
            }
            title = "";
            o.LJIIIZ(title, "title");
            c28666BMw.LJLIL.setText(title);
            return;
        }
        if (!(holder instanceof C28328B9w)) {
            return;
        }
        if (LJLZ() >= 3 && i > ((this.LJLJI + this.LJLJJI) + 2) - 2) {
            i5 = 3;
        } else if (LJLZ() >= 2 && i > LJZ() - 1) {
            i5 = 2;
        } else if (LJLZ() >= 1 && i > 0) {
            i5 = 1;
        }
        C28328B9w c28328B9w = (C28328B9w) holder;
        RoomSticker sticker = (RoomSticker) ListProtector.get(this.LJLILLLLZI, i - i5);
        InterfaceC88472Yns<? super RoomSticker, C76800UCe> onStickerItemSelected = this.LJLIL;
        o.LJIIIZ(sticker, "sticker");
        o.LJIIIZ(onStickerItemSelected, "onStickerItemSelected");
        if (LiveBroadcastImageCacheRefactorSetting.INSTANCE.getValue()) {
            i2 = (B9K.LIZJ(c28328B9w.LJLIL.getContext()) - 144) / 3;
            i3 = C87277YNd.LJIIJJI(100);
        } else {
            i2 = -1;
            i3 = -1;
        }
        BQO LIZ = C15650jR.LIZ();
        ImageModel imageModel = sticker.image;
        if (imageModel != null) {
            list = imageModel.getUrls();
        } else {
            list = null;
        }
        C78720Uuy LIZ2 = LIZ.LIZ(list);
        LIZ2.LJI = i2;
        LIZ2.LJII = i3;
        LIZ2.LIZLLL(ImageView.ScaleType.CENTER_INSIDE);
        LIZ2.LJIIJJI = new C28326B9u(c28328B9w);
        LIZ2.LJIIJJI(c28328B9w.LJLIL);
        C16880lQ.LJIIJ(new ACListenerS40S0200000_5(sticker, onStickerItemSelected, 27), c28328B9w.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder c28328B9w;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i == 1) {
            c28328B9w = new C28666BMw(C1FL.LIZIZ(parent, R.layout.dim, parent, false, "from(parent.context).inf…_category, parent, false)"));
        } else {
            View LIZ = C28289B8j.LIZ(parent, R.layout.dip, parent, false);
            LIZ.setTag(Integer.valueOf(i));
            c28328B9w = new C28328B9w(LIZ);
        }
        C0AX.LIZ(parent, c28328B9w.itemView, R.id.lj7);
        View view = c28328B9w.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c28328B9w.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c28328B9w.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c28328B9w.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c28328B9w.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c28328B9w.getClass().getName();
        return c28328B9w;
    }
}
