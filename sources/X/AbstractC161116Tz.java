package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.6Tz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC161116Tz<T extends StickerModel> extends FrameLayout implements G27, C6UF<T> {
    public final C6UA LJLIL;
    public InterfaceC82683Wch LJLILLLLZI;
    public PointF LJLJI;
    public InteractStickerStruct LJLJJI;

    public void LJFF() {
    }

    @Override // X.C6UF
    public View getView() {
        return this;
    }

    @Override // X.C6UF
    public final void LIZJ() {
        LJFF();
    }

    public final C6UA getInteractStickerContainerCommonParam() {
        return this.LJLIL;
    }

    public final PointF getLastDownPoint() {
        return this.LJLJI;
    }

    public final InteractStickerStruct getStruct() {
        return this.LJLJJI;
    }

    public final InterfaceC82683Wch getTuxActionTooltip() {
        return this.LJLILLLLZI;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.LJLJI = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setLastDownPoint(PointF pointF) {
        o.LJIIIZ(pointF, "<set-?>");
        this.LJLJI = pointF;
    }

    public final void setStruct(InteractStickerStruct interactStickerStruct) {
        o.LJIIIZ(interactStickerStruct, "<set-?>");
        this.LJLJJI = interactStickerStruct;
    }

    public final void setTuxActionTooltip(InterfaceC82683Wch interfaceC82683Wch) {
        this.LJLILLLLZI = interfaceC82683Wch;
    }

    public void LIZIZ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        this.LJLJJI = interactStickerStruct;
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        InterfaceC82683Wch interfaceC82683Wch = this.LJLILLLLZI;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC161116Tz(Context context, AttributeSet attributeSet, int i, C6UA c6ua) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLIL = c6ua;
        this.LJLJI = new PointF(0.0f, 0.0f);
        this.LJLJJI = new InteractStickerStruct();
    }

    public /* synthetic */ AbstractC161116Tz(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (C6UA) null);
    }
}
