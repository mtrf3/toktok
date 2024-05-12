package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.views.IDlS17S0200000_2;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5h4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141585h4 extends FrameLayout {
    public static final /* synthetic */ int LJLL = 0;
    public int LJLIL;
    public ImageView LJLILLLLZI;
    public C81232VuO LJLJI;
    public View LJLJJI;
    public C29701Eo LJLJJL;
    public ObjectAnimator LJLJJLL;
    public int LJLJL;
    public InterfaceC141575h3 LJLJLJ;
    public ReadTextEffectBean LJLJLLL;

    public final void LIZIZ() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.LJLJJLL;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = this.LJLJJLL) != null) {
            objectAnimator.cancel();
        }
        ImageView imageView = this.LJLILLLLZI;
        if (imageView == null) {
            return;
        }
        imageView.setRotation(0.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.LJLJJLL;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = this.LJLJJLL) != null) {
            objectAnimator.end();
        }
        C29701Eo c29701Eo = this.LJLJJL;
        if (c29701Eo != null) {
            c29701Eo.cancelAnimation();
        }
        super.onDetachedFromWindow();
    }

    public final ReadTextEffectBean getModel() {
        return this.LJLJLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C141585h4(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj, null, 0);
        new LinkedHashMap();
        this.LJLIL = -1;
    }

    public final void LIZ(ReadTextEffectBean readTextEffectBean) {
        boolean z;
        Effect effect;
        List<String> urlList;
        C81232VuO c81232VuO;
        Resources resources;
        String str;
        this.LJLJLLL = readTextEffectBean;
        if (this.LJLJL == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = null;
        if (z) {
            C81232VuO c81232VuO2 = this.LJLJI;
            if (c81232VuO2 != null) {
                Context context = c81232VuO2.getContext();
                if (context != null) {
                    str = context.getString(R.string.itj);
                } else {
                    str = null;
                }
                c81232VuO2.setText(str);
            }
            C81232VuO c81232VuO3 = this.LJLJI;
            if (c81232VuO3 != null) {
                c81232VuO3.setIconImagePadding(10);
            }
            C81232VuO c81232VuO4 = this.LJLJI;
            if (c81232VuO4 != null) {
                Context context2 = c81232VuO4.getContext();
                if (context2 != null && (resources = context2.getResources()) != null) {
                    drawable = resources.getDrawable(R.drawable.b62);
                }
                c81232VuO4.LIZ(drawable);
            }
            ImageView imageView = this.LJLILLLLZI;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            setSelectedView(false);
            return;
        }
        if (readTextEffectBean == null || (effect = readTextEffectBean.effect) == null) {
            return;
        }
        C81232VuO c81232VuO5 = this.LJLJI;
        if (c81232VuO5 != null) {
            c81232VuO5.setText(effect.getName());
        }
        if (readTextEffectBean.mSpeaker.isFake) {
            C81232VuO c81232VuO6 = this.LJLJI;
            if (c81232VuO6 != null) {
                C81233VuP c81233VuP = c81232VuO6.LJLIL;
                if (c81233VuP != null) {
                    if (c81233VuP.LJLIL) {
                        SmartImageView smartImageView = c81233VuP.LJLJI;
                        if (smartImageView != null) {
                            C78764Uvg.LIZ(smartImageView, R.drawable.b9q);
                        } else {
                            o.LJIJI("smartImageView");
                            throw null;
                        }
                    } else {
                        C72790ShW c72790ShW = c81233VuP.LJLILLLLZI;
                        if (c72790ShW != null) {
                            C78764Uvg.LIZ(c72790ShW, R.drawable.b9q);
                        } else {
                            o.LJIJI("iconImageView");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("imageView");
                    throw null;
                }
            }
        } else {
            UrlModel iconUrl = readTextEffectBean.effect.getIconUrl();
            if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null && !urlList.isEmpty() && (c81232VuO = this.LJLJI) != null) {
                o.LJI(urlList);
                c81232VuO.LIZLLL((String) ListProtector.get(urlList, 0));
            }
        }
        setSelectedView(false);
        InterfaceC141575h3 interfaceC141575h3 = this.LJLJLJ;
        if (interfaceC141575h3 != null) {
            if (interfaceC141575h3.LLD(readTextEffectBean.mSpeaker.speakreID)) {
                LIZJ(1, false);
                return;
            } else {
                LIZJ(0, false);
                return;
            }
        }
        o.LJIJI(WM7.SCENE_SERVICE);
        throw null;
    }

    public final void setModel(ReadTextEffectBean readTextEffectBean) {
        this.LJLJLLL = readTextEffectBean;
    }

    public final void setSelectedView(boolean z) {
        C81232VuO c81232VuO = this.LJLJI;
        if (c81232VuO != null) {
            c81232VuO.LJ(z);
        }
        if (!z || this.LJLJL == 0) {
            View view = this.LJLJJI;
            if (view != null) {
                view.setVisibility(8);
            }
            C29701Eo c29701Eo = this.LJLJJL;
            if (c29701Eo == null) {
                return;
            }
            c29701Eo.setVisibility(8);
            return;
        }
        View view2 = this.LJLJJI;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        C29701Eo c29701Eo2 = this.LJLJJL;
        if (c29701Eo2 == null) {
            return;
        }
        c29701Eo2.setVisibility(0);
    }

    public final void LIZJ(int i, boolean z) {
        this.LJLIL = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                } else {
                    if (this.LJLJL == 0) {
                        setSelectedView(true);
                        return;
                    }
                    ImageView imageView = this.LJLILLLLZI;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    ImageView imageView2 = this.LJLILLLLZI;
                    if (imageView2 != null) {
                        imageView2.setImageResource(R.drawable.th);
                    }
                    ImageView imageView3 = this.LJLILLLLZI;
                    if (imageView3 == null) {
                        return;
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView3, "rotation", 0.0f, 360.0f);
                    this.LJLJJLL = ofFloat;
                    if (ofFloat != null) {
                        ofFloat.setDuration(800L);
                    }
                    ObjectAnimator objectAnimator = this.LJLJJLL;
                    if (objectAnimator != null) {
                        objectAnimator.setRepeatMode(1);
                    }
                    ObjectAnimator objectAnimator2 = this.LJLJJLL;
                    if (objectAnimator2 != null) {
                        objectAnimator2.setRepeatCount(-1);
                    }
                    ObjectAnimator objectAnimator3 = this.LJLJJLL;
                    if (objectAnimator3 == null) {
                        return;
                    }
                    objectAnimator3.start();
                    return;
                }
            } else {
                ImageView imageView4 = this.LJLILLLLZI;
                if (imageView4 != null) {
                    imageView4.setVisibility(8);
                }
                LIZIZ();
                if (!z) {
                    return;
                }
                setSelectedView(true);
                return;
            }
        }
        ImageView imageView5 = this.LJLILLLLZI;
        if (imageView5 != null) {
            imageView5.setImageResource(R.drawable.b5f);
        }
        ImageView imageView6 = this.LJLILLLLZI;
        if (imageView6 != null) {
            imageView6.setVisibility(0);
        }
        LIZIZ();
    }

    public final void LIZLLL(ViewGroup viewGroup, LayoutInflater layoutInflater, int i, InterfaceC141575h3 panel) {
        o.LJIIIZ(panel, "panel");
        this.LJLJL = i;
        this.LJLJLJ = panel;
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.jd, viewGroup, false);
        this.LJLILLLLZI = (ImageView) LLLLIILL.findViewById(R.id.eyc);
        this.LJLJJL = (C29701Eo) LLLLIILL.findViewById(R.id.gaa);
        this.LJLJJI = LLLLIILL.findViewById(R.id.dls);
        C29701Eo c29701Eo = this.LJLJJL;
        if (c29701Eo != null) {
            c29701Eo.setAnimation("little_audio_wave_anim.json");
            c29701Eo.setRepeatCount(-1);
            c29701Eo.playAnimation();
        }
        C81232VuO c81232VuO = (C81232VuO) LLLLIILL.findViewById(R.id.ek5);
        c81232VuO.setClickStatusColor(C173636rf.LIZ(R.attr.dj, c81232VuO.getContext()));
        this.LJLJI = c81232VuO;
        C16880lQ.LJIIJ(new IDlS17S0200000_2(panel, this, 3), LLLLIILL);
        addView(LLLLIILL);
    }
}
