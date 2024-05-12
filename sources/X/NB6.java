package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NB6 extends AbstractC029409q<NB7> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ XXY LJLILLLLZI;
    public final /* synthetic */ List<MusicCollectionItem> LJLJI;
    public final /* synthetic */ int LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(NB7 nb7, int i) {
        NB7 holder = nb7;
        o.LJIIIZ(holder, "holder");
        ArrayList arrayList = new ArrayList();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        LinearLayout linearLayout = this.LJLILLLLZI.LJLJI;
                        if (linearLayout != null) {
                            linearLayout.setVisibility(8);
                        }
                    } else if (this.LJLJJI < 4) {
                        LinearLayout linearLayout2 = this.LJLILLLLZI.LJLJI;
                        if (linearLayout2 != null) {
                            linearLayout2.setVisibility(8);
                        }
                    } else {
                        Object obj = ListProtector.get(this.LJLJI, 3);
                        ((MusicCollectionItem) obj).setPlaylistOrder(3);
                        arrayList.add(obj);
                        Object obj2 = ListProtector.get(this.LJLJI, 7);
                        ((MusicCollectionItem) obj2).setPlaylistOrder(7);
                        arrayList.add(obj2);
                        if (this.LJLJI.size() >= 12) {
                            Object obj3 = ListProtector.get(this.LJLJI, 11);
                            ((MusicCollectionItem) obj3).setPlaylistOrder(11);
                            arrayList.add(obj3);
                        }
                    }
                } else {
                    Object obj4 = ListProtector.get(this.LJLJI, 2);
                    ((MusicCollectionItem) obj4).setPlaylistOrder(2);
                    arrayList.add(obj4);
                    if (this.LJLJJI < 4) {
                        Object obj5 = ListProtector.get(this.LJLJI, 5);
                        ((MusicCollectionItem) obj5).setPlaylistOrder(5);
                        arrayList.add(obj5);
                        Object obj6 = ListProtector.get(this.LJLJI, 8);
                        ((MusicCollectionItem) obj6).setPlaylistOrder(8);
                        arrayList.add(obj6);
                    } else {
                        Object obj7 = ListProtector.get(this.LJLJI, 6);
                        ((MusicCollectionItem) obj7).setPlaylistOrder(6);
                        arrayList.add(obj7);
                        if (this.LJLJI.size() >= 11) {
                            Object obj8 = ListProtector.get(this.LJLJI, 10);
                            ((MusicCollectionItem) obj8).setPlaylistOrder(10);
                            arrayList.add(obj8);
                        }
                    }
                }
            } else {
                Object obj9 = ListProtector.get(this.LJLJI, 1);
                ((MusicCollectionItem) obj9).setPlaylistOrder(1);
                arrayList.add(obj9);
                if (this.LJLJJI < 4) {
                    Object obj10 = ListProtector.get(this.LJLJI, 4);
                    ((MusicCollectionItem) obj10).setPlaylistOrder(4);
                    arrayList.add(obj10);
                    Object obj11 = ListProtector.get(this.LJLJI, 7);
                    ((MusicCollectionItem) obj11).setPlaylistOrder(7);
                    arrayList.add(obj11);
                } else {
                    Object obj12 = ListProtector.get(this.LJLJI, 5);
                    ((MusicCollectionItem) obj12).setPlaylistOrder(5);
                    arrayList.add(obj12);
                    Object obj13 = ListProtector.get(this.LJLJI, 9);
                    ((MusicCollectionItem) obj13).setPlaylistOrder(9);
                    arrayList.add(obj13);
                }
            }
        } else {
            Object obj14 = ListProtector.get(this.LJLJI, 0);
            ((MusicCollectionItem) obj14).setPlaylistOrder(0);
            arrayList.add(obj14);
            if (this.LJLJJI < 4) {
                Object obj15 = ListProtector.get(this.LJLJI, 3);
                ((MusicCollectionItem) obj15).setPlaylistOrder(3);
                arrayList.add(obj15);
                Object obj16 = ListProtector.get(this.LJLJI, 6);
                ((MusicCollectionItem) obj16).setPlaylistOrder(6);
                arrayList.add(obj16);
            } else {
                Object obj17 = ListProtector.get(this.LJLJI, 4);
                ((MusicCollectionItem) obj17).setPlaylistOrder(4);
                arrayList.add(obj17);
                Object obj18 = ListProtector.get(this.LJLJI, 8);
                ((MusicCollectionItem) obj18).setPlaylistOrder(8);
                arrayList.add(obj18);
            }
        }
        LinearLayout linearLayout3 = holder.LJLJI;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(0);
        }
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                if (size != 2) {
                    NB8 nb8 = holder.LJLJJI;
                    if (nb8 != null) {
                        nb8.setVisibility(0);
                    }
                    NB8 nb82 = holder.LJLJJL;
                    if (nb82 != null) {
                        nb82.setVisibility(0);
                    }
                    NB8 nb83 = holder.LJLJJLL;
                    if (nb83 != null) {
                        nb83.setVisibility(0);
                    }
                    NB8 nb84 = holder.LJLJJI;
                    if (nb84 != null) {
                        nb84.LIZ(holder.LJLIL, holder.LJLILLLLZI, (MusicCollectionItem) ListProtector.get(arrayList, 0));
                    }
                    NB8 nb85 = holder.LJLJJL;
                    if (nb85 != null) {
                        nb85.LIZ(holder.LJLIL, holder.LJLILLLLZI, (MusicCollectionItem) ListProtector.get(arrayList, 1));
                    }
                    NB8 nb86 = holder.LJLJJLL;
                    if (nb86 != null) {
                        nb86.LIZ(holder.LJLIL, holder.LJLILLLLZI, (MusicCollectionItem) ListProtector.get(arrayList, 2));
                        return;
                    }
                    return;
                }
                NB8 nb87 = holder.LJLJJI;
                if (nb87 != null) {
                    nb87.setVisibility(0);
                }
                NB8 nb88 = holder.LJLJJL;
                if (nb88 != null) {
                    nb88.setVisibility(0);
                }
                NB8 nb89 = holder.LJLJJLL;
                if (nb89 != null) {
                    nb89.setVisibility(8);
                }
                NB8 nb810 = holder.LJLJJI;
                if (nb810 != null) {
                    nb810.LIZ(holder.LJLIL, holder.LJLILLLLZI, (MusicCollectionItem) ListProtector.get(arrayList, 0));
                }
                NB8 nb811 = holder.LJLJJL;
                if (nb811 == null) {
                    return;
                }
                nb811.LIZ(holder.LJLIL, holder.LJLILLLLZI, (MusicCollectionItem) ListProtector.get(arrayList, 1));
                return;
            }
            NB8 nb812 = holder.LJLJJI;
            if (nb812 != null) {
                nb812.setVisibility(0);
            }
            NB8 nb813 = holder.LJLJJL;
            if (nb813 != null) {
                nb813.setVisibility(8);
            }
            NB8 nb814 = holder.LJLJJLL;
            if (nb814 != null) {
                nb814.setVisibility(8);
            }
            NB8 nb815 = holder.LJLJJI;
            if (nb815 == null) {
                return;
            }
            nb815.LIZ(holder.LJLIL, holder.LJLILLLLZI, (MusicCollectionItem) ListProtector.get(arrayList, 0));
            return;
        }
        LinearLayout linearLayout4 = holder.LJLJI;
        if (linearLayout4 == null) {
            return;
        }
        linearLayout4.setVisibility(8);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final NB7 com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        NB7 nb7 = new NB7(C1FL.LIZIZ(parent, R.layout.bd8, parent, false, "from(parent.context).inf…se,\n                    )"), this.LJLIL, this.LJLILLLLZI.LJLILLLLZI);
        C0AX.LIZ(parent, nb7.itemView, R.id.lj7);
        View view = nb7.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (nb7.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(NB7.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) nb7.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(nb7.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = NB7.class.getName();
        return nb7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NB6(int i, XXY xxy, List<? extends MusicCollectionItem> list, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = xxy;
        this.LJLJI = list;
        this.LJLJJI = i2;
    }
}
