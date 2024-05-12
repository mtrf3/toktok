package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import defpackage.a1;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.WFw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81992WFw extends WG4 {
    public C81993WFx LJLIL;
    public C80968Vq8 LJLILLLLZI;
    public String LJLJI;

    @Override // X.WG4
    public final void LIZ() {
        LIZIZ(0.0f);
        setTimeBubble(0);
        C81993WFx c81993WFx = this.LJLIL;
        if (c81993WFx != null) {
            c81993WFx.setScrollDx(0.0f);
        } else {
            o.LJIJI("cutMusicScrollView");
            throw null;
        }
    }

    @Override // X.WG4
    public final void LIZIZ(float f) {
        C81993WFx c81993WFx = this.LJLIL;
        if (c81993WFx != null) {
            c81993WFx.post(new RunnableC41258GHe(c81993WFx, f));
        } else {
            o.LJIJI("cutMusicScrollView");
            throw null;
        }
    }

    @Override // X.WG4
    public final void LIZJ(float f) {
        C81993WFx c81993WFx = this.LJLIL;
        if (c81993WFx != null) {
            C81991WFv c81991WFv = c81993WFx.LLLF;
            if (c81991WFv != null) {
                int i = (int) c81993WFx.LLLFFI;
                c81991WFv.LJLJJLL = i;
                c81991WFv.LJLJI = f;
                C81990WFu c81990WFu = c81991WFv.LJLILLLLZI;
                int i2 = c81991WFv.LJLJLLL + i;
                c81990WFu.LJFF = i;
                c81990WFu.LJI = i2;
                c81991WFv.invalidate();
                return;
            }
            o.LJIJI("cutMusicView");
            throw null;
        }
        o.LJIJI("cutMusicScrollView");
        throw null;
    }

    @Override // X.WG4
    public void setAudioWaveViewData(AVMusicWaveBean aVMusicWaveBean) {
        C81993WFx c81993WFx = this.LJLIL;
        if (c81993WFx != null) {
            c81993WFx.setAudioWaveViewData(aVMusicWaveBean);
        } else {
            o.LJIJI("cutMusicScrollView");
            throw null;
        }
    }

    @Override // X.WG4
    public void setBubbleText(String str) {
        C80968Vq8 c80968Vq8 = this.LJLILLLLZI;
        if (c80968Vq8 != null) {
            c80968Vq8.setText(str);
        } else {
            o.LJIJI("bubbleTextView");
            throw null;
        }
    }

    @Override // X.WG4
    public void setBubbleTextViewAttribute(C80969Vq9 attribute) {
        o.LJIIIZ(attribute, "attribute");
        C80968Vq8 c80968Vq8 = this.LJLILLLLZI;
        if (c80968Vq8 != null) {
            c80968Vq8.setAttribute(attribute);
        } else {
            o.LJIJI("bubbleTextView");
            throw null;
        }
    }

    @Override // X.WG4
    public void setScrollListener(InterfaceC81994WFy scrollListener) {
        o.LJIIIZ(scrollListener, "scrollListener");
        C81993WFx c81993WFx = this.LJLIL;
        if (c81993WFx != null) {
            c81993WFx.setScrollListener(scrollListener);
        } else {
            o.LJIJI("cutMusicScrollView");
            throw null;
        }
    }

    @Override // X.WG4
    public void setTimeBubble(int i) {
        String str = this.LJLJI;
        if (str != null) {
            String LLLZ = C16880lQ.LLLZ(str, Arrays.copyOf(new Object[]{C78605Ut7.LJIIL(i)}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            setBubbleText(LLLZ);
            return;
        }
        o.LJIJI("bubbleText");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81992WFw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.color}, 0, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…cLayout, defStyleAttr, 0)");
        int color = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        C80968Vq8 c80968Vq8 = new C80968Vq8(context);
        this.LJLILLLLZI = c80968Vq8;
        c80968Vq8.setId(com.zhiliaoapp.musically.R.id.m15);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = (int) KL2.LIZJ(context, 8.0f);
        layoutParams.leftMargin = (int) KL2.LIZJ(context, 8.0f);
        layoutParams.setMarginStart((int) KL2.LIZJ(context, 8.0f));
        layoutParams.addRule(9);
        layoutParams.addRule(20);
        C80968Vq8 c80968Vq82 = this.LJLILLLLZI;
        if (c80968Vq82 != null) {
            c80968Vq82.setLayoutParams(layoutParams);
            C80968Vq8 c80968Vq83 = this.LJLILLLLZI;
            if (c80968Vq83 != null) {
                addView(c80968Vq83);
                C81993WFx c81993WFx = new C81993WFx(context);
                this.LJLIL = c81993WFx;
                c81993WFx.setId(com.zhiliaoapp.musically.R.id.mbq);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(3, com.zhiliaoapp.musically.R.id.m15);
                C81993WFx c81993WFx2 = this.LJLIL;
                if (c81993WFx2 != null) {
                    c81993WFx2.setLayoutParams(layoutParams2);
                    C81993WFx c81993WFx3 = this.LJLIL;
                    if (c81993WFx3 != null) {
                        addView(c81993WFx3);
                        C81993WFx c81993WFx4 = this.LJLIL;
                        if (c81993WFx4 != null) {
                            c81993WFx4.setWaveColor(color);
                            String string = getResources().getString(com.zhiliaoapp.musically.R.string.ed4);
                            o.LJIIIIZZ(string, "resources.getString(R.string.cut_music_start_hint)");
                            this.LJLJI = string;
                            return;
                        }
                        o.LJIJI("cutMusicScrollView");
                        throw null;
                    }
                    o.LJIJI("cutMusicScrollView");
                    throw null;
                }
                o.LJIJI("cutMusicScrollView");
                throw null;
            }
            o.LJIJI("bubbleTextView");
            throw null;
        }
        o.LJIJI("bubbleTextView");
        throw null;
    }
}
