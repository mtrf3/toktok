package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Wb7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82585Wb7 extends AbstractC029409q<RecyclerView.ViewHolder> implements InterfaceC82605WbR {
    public final C29S LJLIL;
    public final InterfaceC153045zY LJLILLLLZI;
    public final VideoPublishEditModel LJLJI;
    public final AudioEffectParam LJLJJI;
    public final InterfaceC143655kP LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public CategoryPageModel LJLJLJ;
    public List<? extends Effect> LJLJLLL;
    public RecyclerView LJLL;
    public final C82587Wb9 LJLLI;
    public C82584Wb6 LJLLILLLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        int i;
        CategoryEffectModel categoryEffects;
        List<Effect> effects;
        CategoryPageModel categoryPageModel = this.LJLJLJ;
        if (categoryPageModel != null && (categoryEffects = categoryPageModel.getCategoryEffects()) != null && (effects = categoryEffects.getEffects()) != null) {
            i = effects.size();
        } else {
            i = 0;
        }
        return i + 1;
    }

    public final void LJZ(int i) {
        boolean z;
        C81232VuO c81232VuO;
        RecyclerView.ViewHolder viewHolder;
        int itemCount = getItemCount();
        int i2 = this.LJLJL;
        if (i2 >= 0 && i2 < itemCount) {
            z = true;
        } else {
            z = false;
        }
        RecyclerView.ViewHolder viewHolder2 = null;
        if (z) {
            RecyclerView recyclerView = this.LJLL;
            if (recyclerView != null) {
                viewHolder = recyclerView.LJJIZ(i2);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof C82588WbA) {
                C81232VuO c81232VuO2 = ((C82588WbA) viewHolder).LJLJJI;
                if (c81232VuO2 != null) {
                    c81232VuO2.LJ(false);
                }
            } else {
                notifyItemChanged(this.LJLJL);
            }
        }
        this.LJLJL = i;
        if (i < getItemCount()) {
            RecyclerView recyclerView2 = this.LJLL;
            if (recyclerView2 != null) {
                viewHolder2 = recyclerView2.LJJIZ(this.LJLJL);
            }
            if ((viewHolder2 instanceof C82588WbA) && (c81232VuO = ((C82588WbA) viewHolder2).LJLJJI) != null) {
                c81232VuO.LJ(true);
            }
        }
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.LJLL = recyclerView;
    }

    @Override // X.InterfaceC82605WbR
    public final void LIZ(int i, View view) {
        o.LJIIIZ(view, "view");
        C82587Wb9 c82587Wb9 = this.LJLLI;
        if (c82587Wb9 != null) {
            c82587Wb9.LIZ(i, view);
        }
    }

    public final void LJLZ(int i, int i2) {
        RecyclerView.ViewHolder viewHolder;
        if (i >= 0 && i < getItemCount()) {
            RecyclerView recyclerView = this.LJLL;
            if (recyclerView != null) {
                viewHolder = recyclerView.LJJIZ(i);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof C82588WbA) {
                ((C82588WbA) viewHolder).M(i2);
            } else {
                notifyItemChanged(i);
            }
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Effect effect;
        List<String> urlList;
        int i2;
        Resources resources;
        Integer LJJIL;
        Resources resources2;
        String str;
        o.LJIIIZ(viewHolder, "viewHolder");
        if (viewHolder instanceof C82588WbA) {
            Drawable drawable = null;
            if (i > 0) {
                List<? extends Effect> list = this.LJLJLLL;
                o.LJI(list);
                effect = (Effect) ListProtector.get(list, i - 1);
            } else {
                effect = null;
            }
            C82588WbA c82588WbA = (C82588WbA) viewHolder;
            boolean z = true;
            if (c82588WbA.getAdapterPosition() == 0) {
                C81232VuO c81232VuO = c82588WbA.LJLJJI;
                if (c81232VuO != null) {
                    Context context = c81232VuO.getContext();
                    if (context != null) {
                        str = context.getString(R.string.itj);
                    } else {
                        str = null;
                    }
                    c81232VuO.setText(str);
                }
                C81232VuO c81232VuO2 = c82588WbA.LJLJJI;
                if (c81232VuO2 != null) {
                    Context context2 = c81232VuO2.getContext();
                    if (context2 != null && (resources2 = context2.getResources()) != null) {
                        drawable = resources2.getDrawable(R.drawable.b62);
                    }
                    c81232VuO2.LIZ(drawable);
                }
                ImageView imageView = c82588WbA.LJLJI;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                C81232VuO c81232VuO3 = c82588WbA.LJLJJI;
                if (c81232VuO3 != null) {
                    c81232VuO3.LJ(false);
                }
                c82588WbA.M(1);
                C81232VuO c81232VuO4 = c82588WbA.LJLJJI;
                if (c81232VuO4 != null) {
                    c81232VuO4.setIconImagePadding(10);
                }
            } else {
                if (effect != null) {
                    C81232VuO c81232VuO5 = c82588WbA.LJLJJI;
                    if (c81232VuO5 != null) {
                        c81232VuO5.setText(effect.getName());
                    }
                    UrlModel iconUrl = effect.getIconUrl();
                    if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null && !urlList.isEmpty()) {
                        String effectId = effect.getEffectId();
                        if (effectId == null || (LJJIL = C38350F3i.LJJIL(effectId)) == null || LJJIL.intValue() < 0) {
                            o.LJI(urlList);
                            Integer LJJIL2 = C38350F3i.LJJIL((String) ListProtector.get(urlList, 0));
                            if (LJJIL2 != null) {
                                i2 = LJJIL2.intValue();
                            } else {
                                i2 = 0;
                            }
                            C81232VuO c81232VuO6 = c82588WbA.LJLJJI;
                            if (c81232VuO6 != null) {
                                Context context3 = c81232VuO6.getContext();
                                if (context3 != null && (resources = context3.getResources()) != null) {
                                    drawable = resources.getDrawable(i2);
                                }
                                c81232VuO6.LIZ(drawable);
                            }
                        } else {
                            C81232VuO c81232VuO7 = c82588WbA.LJLJJI;
                            if (c81232VuO7 != null) {
                                o.LJI(urlList);
                                c81232VuO7.LIZLLL((String) ListProtector.get(urlList, 0));
                            }
                        }
                    }
                    C81232VuO c81232VuO8 = c82588WbA.LJLJJI;
                    if (c81232VuO8 != null) {
                        c81232VuO8.LJ(false);
                    }
                    C82593WbF.LIZ().getClass();
                    c82588WbA.M(C82594WbG.LIZ(effect) ? 1 : 0);
                }
                C81232VuO c81232VuO9 = c82588WbA.LJLJJI;
                if (c81232VuO9 != null) {
                    c81232VuO9.setIconImagePadding(0);
                }
            }
            if (i != this.LJLJL) {
                z = false;
            }
            C81232VuO c81232VuO10 = c82588WbA.LJLJJI;
            if (c81232VuO10 != null) {
                c81232VuO10.LJ(z);
            }
        }
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        o.LJIIIZ(viewGroup, "viewGroup");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup.getContext()), R.layout.jh, viewGroup, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.FrameLayout");
        C82588WbA c82588WbA = new C82588WbA((FrameLayout) LLLLIILL, this);
        C0AX.LIZ(viewGroup, c82588WbA.itemView, R.id.lj7);
        View view = c82588WbA.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c82588WbA.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C82588WbA.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c82588WbA.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c82588WbA.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C82588WbA.class.getName();
        return c82588WbA;
    }

    public final void LJLLLLLL(String str, String str2, String str3) {
        String str4 = str2;
        if (this.LJLILLLLZI != null && str3 != null && str3.length() > 0) {
            if (str4 == null) {
                str4 = "";
            }
            int duration = this.LJLILLLLZI.getDuration();
            C82593WbF.LIZ().getClass();
            AudioEffectParam audioEffectParam = new AudioEffectParam(str, 0, 0, str3, str4, 0, duration, ((C43523H6h) C82594WbG.LIZJ.getValue()).LIZ.LIZIZ(str3), null, null, 512, null);
            audioEffectParam.setShowErrorToast(true);
            this.LJLJJL.MK(C135285Sq.LIZ(true, audioEffectParam));
        }
    }

    public C82585Wb7(C29S c29s, InterfaceC153045zY interfaceC153045zY, VideoPublishEditModel videoPublishEditModel, AudioEffectParam audioEffectParam, InterfaceC143655kP editPreviewApi) {
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        this.LJLIL = c29s;
        this.LJLILLLLZI = interfaceC153045zY;
        this.LJLJI = videoPublishEditModel;
        this.LJLJJI = audioEffectParam;
        this.LJLJJL = editPreviewApi;
        this.LJLLI = new C82587Wb9(this);
    }
}
