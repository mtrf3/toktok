package X;

import Y.AfS26S1100000_13;
import Y.AfS59S0100000_7;
import Y.IDuS314S0100000_2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import defpackage.a1;
import java.util.HashMap;
import kotlin.jvm.internal.AqS69S1200000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U18 extends C29701Eo {
    public boolean LJLIL;
    public final HashMap<String, Boolean> LJLILLLLZI;

    public final boolean LIZ() {
        Boolean bool = this.LJLILLLLZI.get("image_0");
        Boolean bool2 = Boolean.TRUE;
        if (o.LJ(bool, bool2) && o.LJ(this.LJLILLLLZI.get("image_1"), bool2)) {
            U17 u17 = U17.LIZ;
            if (u17.LIZIZ("image_0") && u17.LIZIZ("image_1")) {
                return true;
            }
        }
        return false;
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
        if (this.LJLIL) {
            cancelAnimation();
            this.LJLIL = false;
        }
        super.playAnimation();
        this.LJLIL = true;
    }

    @Override // X.C29701Eo, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public U18(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U18(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLILLLLZI = new HashMap<>();
        new U1A(this);
        addLottieOnCompositionLoadedListener(new U19(this));
    }

    public final void LIZIZ(ImageModel imageModel, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        U17 u17 = U17.LIZ;
        if (u17.LIZIZ(str)) {
            this.LJLILLLLZI.put(str, Boolean.TRUE);
            interfaceC65784Pro.invoke();
            return;
        }
        final float LJIIJ = C87277YNd.LJIIJ(68);
        AqS69S1200000_13 aqS69S1200000_13 = new AqS69S1200000_13(this, (U18) str, (String) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 1);
        if (u17.LIZIZ(str)) {
            aqS69S1200000_13.invoke(Boolean.TRUE, null);
        } else {
            C31665Cbl.LIZJ(imageModel).LJJIII(new InterfaceC48038ItG() { // from class: X.5ja
                @Override // X.InterfaceC48038ItG
                public final Object apply(Object obj) {
                    final Bitmap bitmapOrigin = (Bitmap) obj;
                    o.LJIIIZ(bitmapOrigin, "bitmapOrigin");
                    if (Math.abs(LJIIJ) < 0.001f) {
                        return AbstractC73672Svk.LJJIJIL(bitmapOrigin);
                    }
                    final float width = LJIIJ / bitmapOrigin.getWidth();
                    return AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.5fQ
                        @Override // X.InterfaceC86003Zc
                        public final void subscribe(InterfaceC73573Su9<Bitmap> interfaceC73573Su9) {
                            try {
                                int width2 = bitmapOrigin.getWidth();
                                int height = bitmapOrigin.getHeight();
                                Matrix matrix = new Matrix();
                                float f = width;
                                matrix.preScale(f, f);
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
            }, false).LJJIII(new InterfaceC48038ItG() { // from class: X.5jc
                public final /* synthetic */ boolean LJLIL = true;

                @Override // X.InterfaceC48038ItG
                public final Object apply(Object obj) {
                    Bitmap scaledBitmap = (Bitmap) obj;
                    o.LJIIIZ(scaledBitmap, "scaledBitmap");
                    if (this.LJLIL) {
                        return AbstractC73672Svk.LJIIJ(new IDuS314S0100000_2(scaledBitmap, 0));
                    }
                    return AbstractC73672Svk.LJJIJIL(scaledBitmap);
                }
            }, false).LJJIII(new InterfaceC48038ItG() { // from class: X.4me
                public final /* synthetic */ boolean LJLIL = true;

                @Override // X.InterfaceC48038ItG
                public final Object apply(Object obj) {
                    final Bitmap roundBitmap = (Bitmap) obj;
                    o.LJIIIZ(roundBitmap, "roundBitmap");
                    if (this.LJLIL) {
                        final float f = 8.0f;
                        return AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.4md
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
                                    paint.setStrokeWidth(f);
                                    float f2 = width * 1.0f;
                                    float f3 = 2;
                                    float f4 = f2 / f3;
                                    canvas.drawCircle(f4, (height * 1.0f) / f3, f4 - ((f - 1) / f3), paint);
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
            }, false).LJJJLIIL(new AfS26S1100000_13(aqS69S1200000_13, str, 0), new AfS59S0100000_7(aqS69S1200000_13, 2));
        }
    }
}
