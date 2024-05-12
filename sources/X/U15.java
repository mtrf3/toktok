package X;

import Y.ALAdapterS10S0100000_13;
import Y.AfS26S1100000_13;
import Y.AfS59S0100000_7;
import Y.AfS64S0100000_12;
import Y.IDhS105S0100000_12;
import Y.IDuS314S0100000_2;
import Y.IDuS323S0100000_13;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicApplyLayoutOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import defpackage.a1;
import java.util.HashMap;
import kotlin.jvm.internal.AqS69S1200000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U15 extends C29701Eo {
    public C73411SrX LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;
    public final HashMap<String, Boolean> LJLJJL;

    public final synchronized void play() {
        if (this.LJLJJI) {
            super.playAnimation();
        }
    }

    public final boolean LIZ() {
        Boolean bool = this.LJLJJL.get("image_0");
        Boolean bool2 = Boolean.TRUE;
        if (o.LJ(bool, bool2) && o.LJ(this.LJLJJL.get("image_1"), bool2)) {
            U16 u16 = U16.LIZ;
            if (u16.LIZIZ("image_0") && u16.LIZIZ("image_1")) {
                return true;
            }
        }
        return false;
    }

    public final void LIZIZ() {
        int i = this.LJLJI;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            setMinAndMaxProgress(0.884058f, 1.0f);
            setRepeatCount(0);
            play();
        } else {
            setMinAndMaxProgress(0.0f, 0.23188405f);
            setRepeatCount(0);
            LJ();
        }
        this.LJLJI = 0;
    }

    public final void LJ() {
        C73411SrX c73411SrX = this.LJLIL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LJLIL = (C73411SrX) AbstractC73672Svk.LJIIJ(new IDuS323S0100000_13(this, 7)).LJJIII(new IDhS105S0100000_12(this, 2), false).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS64S0100000_12(this, 9), new AfS64S0100000_12(this, 10));
    }

    public final LinkPlayerInfo getAnchorInfo() {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null) {
            return null;
        }
        LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
        linkPlayerInfo.LIZ = 2;
        User owner = room.getOwner();
        if (owner == null) {
            return null;
        }
        linkPlayerInfo.mUser = owner;
        return linkPlayerInfo;
    }

    @Override // X.C29701Eo
    public final void playAnimation() {
        if (this.LJLILLLLZI) {
            cancelAnimation();
            this.LJLILLLLZI = false;
        }
        super.playAnimation();
        this.LJLILLLLZI = true;
    }

    @Override // X.C29701Eo, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C75023TcR.LIZLLL.LIZJ("key_applyInfoAttachToWindow");
    }

    @Override // X.C29701Eo, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C73411SrX c73411SrX = this.LJLIL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C54339LUh.LIZ(this);
    }

    public final void LIZJ(boolean z) {
        C75023TcR.LIZLLL.LIZJ("key_toStateRequesting");
        if (this.LJLJI == 1) {
            return;
        }
        if (LinkMicApplyLayoutOptSetting.INSTANCE.getValue() == 2 && z) {
            this.LJLJI = 1;
            setMinAndMaxProgress(0.0f, 0.36231884f);
            setRepeatCount(0);
            LJ();
        } else {
            setMinAndMaxProgress(0.36231884f, 0.85507244f);
            setRepeatCount(-1);
            LJ();
        }
        this.LJLJI = 1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public U15(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U15(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLJI = -1;
        this.LJLJJL = new HashMap<>();
        addLottieOnCompositionLoadedListener(new U1B(this));
        addAnimatorListener(new ALAdapterS10S0100000_13(this, 9));
    }

    public final void LJFF(ImageModel imageModel, String str, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        U16 u16 = U16.LIZ;
        if (u16.LIZIZ(str)) {
            HashMap<String, Boolean> hashMap = this.LJLJJL;
            Boolean bool = Boolean.TRUE;
            hashMap.put(str, bool);
            interfaceC88472Yns.invoke(bool);
            return;
        }
        final boolean LIZ = CCJ.LIZ(getContext());
        AqS69S1200000_13 aqS69S1200000_13 = new AqS69S1200000_13(this, (U15) str, (String) interfaceC88472Yns, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 0);
        if (u16.LIZIZ(str)) {
            aqS69S1200000_13.invoke(Boolean.TRUE, null);
            return;
        }
        final float f = 192.0f;
        final boolean z = false;
        final boolean z2 = true;
        C31665Cbl.LIZJ(imageModel).LJJIII(new InterfaceC48038ItG() { // from class: X.5jZ
            @Override // X.InterfaceC48038ItG
            public final Object apply(Object obj) {
                final Bitmap bitmapOrigin = (Bitmap) obj;
                o.LJIIIZ(bitmapOrigin, "bitmapOrigin");
                if (Math.abs(f) < 0.001f) {
                    return AbstractC73672Svk.LJJIJIL(bitmapOrigin);
                }
                final float width = f / bitmapOrigin.getWidth();
                final boolean z3 = LIZ;
                final boolean z4 = z;
                return AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.5fP
                    @Override // X.InterfaceC86003Zc
                    public final void subscribe(InterfaceC73573Su9<Bitmap> interfaceC73573Su9) {
                        float f2;
                        try {
                            int width2 = bitmapOrigin.getWidth();
                            int height = bitmapOrigin.getHeight();
                            Matrix matrix = new Matrix();
                            float f3 = width;
                            matrix.preScale(f3, f3);
                            float f4 = 1.0f;
                            if (z3) {
                                f2 = -1.0f;
                            } else {
                                f2 = 1.0f;
                            }
                            if (z4) {
                                f4 = -1.0f;
                            }
                            matrix.postScale(f2, f4);
                            interfaceC73573Su9.onNext(Bitmap.createBitmap(bitmapOrigin, 0, 0, width2, height, matrix, false));
                            interfaceC73573Su9.onComplete();
                            bitmapOrigin.recycle();
                        } catch (Exception unused) {
                            interfaceC73573Su9.onNext(bitmapOrigin);
                            interfaceC73573Su9.onComplete();
                        }
                    }
                });
            }
        }, false).LJJIII(new InterfaceC48038ItG() { // from class: X.5jb
            @Override // X.InterfaceC48038ItG
            public final Object apply(Object obj) {
                Bitmap scaledBitmap = (Bitmap) obj;
                o.LJIIIZ(scaledBitmap, "scaledBitmap");
                if (z2) {
                    return AbstractC73672Svk.LJIIJ(new IDuS314S0100000_2(scaledBitmap, 1));
                }
                return AbstractC73672Svk.LJJIJIL(scaledBitmap);
            }
        }, false).LJJIII(new InterfaceC48038ItG() { // from class: X.4mc
            @Override // X.InterfaceC48038ItG
            public final Object apply(Object obj) {
                final Bitmap roundBitmap = (Bitmap) obj;
                o.LJIIIZ(roundBitmap, "roundBitmap");
                if (z2) {
                    final float f2 = 8.0f;
                    return AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.4mb
                        @Override // X.InterfaceC86003Zc
                        public final void subscribe(InterfaceC73573Su9<Bitmap> interfaceC73573Su9) {
                            try {
                                int width = roundBitmap.getWidth();
                                int height = roundBitmap.getHeight();
                                Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(createBitmap);
                                Paint paint = new Paint();
                                canvas.drawBitmap(roundBitmap, 0.0f, 0.0f, paint);
                                paint.setAntiAlias(true);
                                paint.setColor(-1);
                                paint.setStyle(Paint.Style.STROKE);
                                paint.setStrokeWidth(f2);
                                float f3 = width * 1.0f;
                                float f4 = 2;
                                float f5 = f3 / f4;
                                canvas.drawCircle(f5, (height * 1.0f) / f4, f5 - ((f2 - 1) / f4), paint);
                                interfaceC73573Su9.onNext(createBitmap);
                                interfaceC73573Su9.onComplete();
                                roundBitmap.recycle();
                            } catch (Exception unused) {
                                interfaceC73573Su9.onNext(roundBitmap);
                                interfaceC73573Su9.onComplete();
                            }
                        }
                    });
                }
                return AbstractC73672Svk.LJJIJIL(roundBitmap);
            }
        }, false).LJJJLIIL(new AfS26S1100000_13(aqS69S1200000_13, str, 16), new AfS59S0100000_7(aqS69S1200000_13, 88));
    }
}
