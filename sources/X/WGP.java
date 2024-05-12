package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public abstract class WGP extends View {
    public abstract void LIZ(int i, int i2);

    public abstract void LIZIZ(AVMusicWaveBean aVMusicWaveBean, int i);

    public abstract int getMovableWidth();

    public abstract int getStopPosition();

    public abstract void setOnProgressChangeListener(InterfaceC81987WFr interfaceC81987WFr);

    public abstract void setPastPosition(int i);

    public abstract void setProgress(int i);

    public abstract void setStopPosition(int i);

    public abstract void setTotalTime(long j);

    public abstract void setWavForm(Bitmap bitmap);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WGP(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WGP(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
    }
}
