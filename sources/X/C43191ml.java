package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1ml, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43191ml extends C1KD<C1UU, FilterModel> {
    public final Context LJLILLLLZI;
    public final InterfaceC15730jZ LJLJI;
    public int LJLJJI;

    public static void LLIL(C1UU c1uu) {
        c1uu.LJLILLLLZI.setVisibility(0);
        c1uu.LJLJJI.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        c1uu.LJLJJI.setSelected(true);
        c1uu.LJLJJI.setTextColor(C15380j0.LIZIZ(R.color.zk));
    }

    public static void LLILII(C1UU c1uu) {
        c1uu.LJLILLLLZI.setVisibility(4);
        c1uu.LJLJJI.setEllipsize(null);
        c1uu.LJLJJI.setSelected(false);
        c1uu.LJLJJI.setTextColor(C15380j0.LIZIZ(R.color.a48));
    }

    public final void LLILIL(final List<FilterModel> list) {
        this.LJLJJI = InterfaceC30442Bx8.LJIJI.LIZJ().intValue();
        final List<Effect> list2 = this.LJLIL;
        C03200Aq.LIZ(new AbstractC03120Ai(list2, list) { // from class: X.1cY
            public final List<FilterModel> LIZ;
            public final List<FilterModel> LIZIZ;

            @Override // X.AbstractC03120Ai
            public final int LIZLLL() {
                return this.LIZIZ.size();
            }

            @Override // X.AbstractC03120Ai
            public final int LJ() {
                return this.LIZ.size();
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                o.LJIIIZ(list2, "oldData");
                o.LJIIIZ(list, "newData");
                this.LIZ = list2;
                this.LIZIZ = list;
            }

            @Override // X.AbstractC03120Ai
            public final boolean LIZ(int i, int i2) {
                Object obj;
                UrlModel iconUrl;
                List<String> urlList;
                UrlModel iconUrl2;
                List<String> urlList2;
                LiveEffect liveEffect = (LiveEffect) ListProtector.get(this.LIZ, i);
                LiveEffect liveEffect2 = (LiveEffect) ListProtector.get(this.LIZIZ, i2);
                if (!o.LJ(liveEffect.getName(), liveEffect2.getName())) {
                    return false;
                }
                Effect effect = liveEffect.getEffect();
                Object obj2 = null;
                if (effect != null && (iconUrl2 = effect.getIconUrl()) != null && (urlList2 = iconUrl2.getUrlList()) != null) {
                    obj = ORZ.LJLLLL(urlList2);
                } else {
                    obj = null;
                }
                Effect effect2 = liveEffect2.getEffect();
                if (effect2 != null && (iconUrl = effect2.getIconUrl()) != null && (urlList = iconUrl.getUrlList()) != null) {
                    obj2 = ORZ.LJLLLL(urlList);
                }
                if (!o.LJ(obj, obj2)) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC03120Ai
            public final boolean LIZIZ(int i, int i2) {
                return o.LJ(((LiveEffect) ListProtector.get(this.LIZ, i)).getFilterId(), ((LiveEffect) ListProtector.get(this.LIZIZ, i2)).getFilterId());
            }
        }, true).LIZJ(this);
        ((ArrayList) this.LJLIL).clear();
        ((ArrayList) this.LJLIL).addAll(list);
    }

    public C43191ml(Context context, InterfaceC15730jZ interfaceC15730jZ) {
        this.LJLILLLLZI = context;
        this.LJLJI = interfaceC15730jZ;
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        C1UU c1uu = new C1UU(C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLILLLLZI), R.layout.d2n, viewGroup, false));
        C0AX.LIZ(viewGroup, c1uu.itemView, R.id.lj7);
        View view = c1uu.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c1uu.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1UU.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1uu.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c1uu.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C1UU.class.getName();
        return c1uu;
    }

    @Override // X.C1KD
    public final /* bridge */ /* synthetic */ void LLIIJLIL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLIL((C1UU) viewHolder);
    }

    @Override // X.C1KD
    public final /* bridge */ /* synthetic */ void LLIILII(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLILII((C1UU) viewHolder);
    }

    @Override // X.C1KD
    public final void LLIIZ(final int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        EffectManager effectManager;
        final C1UU c1uu = (C1UU) viewHolder;
        FilterModel filterModel = (FilterModel) obj;
        int filterType = filterModel.getFilterType();
        if (filterType != 0) {
            if (filterType != 1) {
                if (filterType == 2) {
                    C47061t0 c47061t0 = c1uu.LJLJI;
                    UrlModel iconUrl = filterModel.getEffect().getIconUrl();
                    ImageModel imageModel = new ImageModel();
                    imageModel.setUri(iconUrl.getUri());
                    imageModel.setUrls(iconUrl.getUrlList());
                    C15620jO.LIZIZ(imageModel, c47061t0);
                    c1uu.LJLJJI.setText(filterModel.getEffect().getName());
                    C33771Uf c33771Uf = C15750jb.LIZ;
                    c33771Uf.getClass();
                    if (filterModel.getFilterType() != 2 || (effectManager = c33771Uf.LIZIZ) == null || !effectManager.isEffectDownloading(filterModel.getEffect())) {
                        c1uu.LJLIL.setVisibility(8);
                    } else {
                        c1uu.LJLIL.setVisibility(0);
                    }
                    c1uu.LJLJJL.setVisibility(4);
                    ImageView imageView = c1uu.LJLJJLL;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                }
            } else {
                c1uu.LJLJI.setImageDrawable(C15380j0.LJI(filterModel.getLocalFilter().getCoverResId()));
                c1uu.LJLJJI.setText(filterModel.getLocalFilter().getName());
                c1uu.LJLIL.setVisibility(8);
                ImageView imageView2 = c1uu.LJLJJLL;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                c1uu.LJLJJL.setVisibility(4);
            }
        } else {
            c1uu.LJLJI.setImageResource(R.drawable.cdm);
            ImageView imageView3 = c1uu.LJLJJLL;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
            c1uu.LJLJJI.setText(filterModel.getLocalFilter().getName());
            c1uu.LJLIL.setVisibility(8);
            c1uu.LJLJJL.setVisibility(4);
        }
        if (i == this.LJLJJI) {
            LLIL(c1uu);
        } else {
            LLILII(c1uu);
        }
        C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.0jY
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C43191ml c43191ml = C43191ml.this;
                int i2 = i;
                C1UU c1uu2 = c1uu;
                if (c43191ml.LJLJI != null) {
                    c43191ml.LLFII(c43191ml.LJLJJI);
                    c43191ml.LLFFF(i2);
                    c43191ml.LJLJJI = i2;
                    Collection collection = c43191ml.LJLIL;
                    if (collection != null && ((ArrayList) collection).size() > i2 && ((LiveEffect) ListProtector.get(c43191ml.LJLIL, i2)).getEffect() != null) {
                        if (c1uu2 != null) {
                            c1uu2.LJLJJL.setVisibility(4);
                        }
                        ((LiveEffect) ListProtector.get(c43191ml.LJLIL, i2)).isNew = false;
                        C33771Uf c33771Uf2 = C15750jb.LIZ;
                        String id = ((LiveEffect) ListProtector.get(c43191ml.LJLIL, i2)).getEffect().getId();
                        if (c33771Uf2.LIZ != null && !TextUtils.isEmpty(id)) {
                            Iterator it = ((ArrayList) c33771Uf2.LIZ).iterator();
                            while (it.hasNext()) {
                                LiveEffect liveEffect = (LiveEffect) it.next();
                                if (liveEffect.getEffect() != null && id.equals(liveEffect.getEffect().getId())) {
                                    liveEffect.isNew = false;
                                    String tagsUpdatedAt = liveEffect.getEffect().getTagsUpdatedAt();
                                    EffectManager effectManager2 = c33771Uf2.LIZIZ;
                                    if (effectManager2 != null) {
                                        effectManager2.updateTag(id, tagsUpdatedAt, null);
                                    }
                                }
                            }
                        }
                    }
                    c43191ml.LJLJI.onItemClick(i2);
                }
            }
        }, c1uu.itemView);
    }
}
