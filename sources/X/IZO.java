package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.texturerender.VideoSurface;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IZO extends C46742IWc {
    public boolean LJLJI;
    public boolean LJLJJI;
    public Bundle LJLJJL;

    public final void LJFF() {
        C46882Iac player;
        VideoSurface videoSurface;
        C46882Iac player2 = this.LJLILLLLZI.getPlayer();
        if (player2 != null && (player = this.LJLILLLLZI.getPlayer()) != null && (videoSurface = player.LIZ.O0) != null && videoSurface.LJI(19, 2) == 1) {
            Bundle LIZLLL = C1DG.LIZLLL("action", 19, "int_value", 0);
            LIZLLL.putInt("effect_type", 2);
            player2.LJLJLJ(LIZLLL);
        }
    }

    public IZO(InterfaceC46804IYm interfaceC46804IYm) {
        super(interfaceC46804IYm);
    }

    public final void LJI(C74152vb c74152vb) {
        List<Bitmap> list;
        C46882Iac player = this.LJLILLLLZI.getPlayer();
        if (player == null || c74152vb == null || (list = c74152vb.LIZIZ) == null) {
            return;
        }
        Bundle LIZLLL = C1DG.LIZLLL("action", 21, "effect_type", 2);
        if (list.size() > 1) {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < list.size(); i++) {
                hashMap.put(Integer.valueOf(i), ListProtector.get(list, i));
            }
            LIZLLL.putSerializable("lut_bitmap_multi", hashMap);
        } else {
            LIZLLL.putParcelable("lut_bitmap", (Parcelable) ListProtector.get(list, 0));
        }
        LIZLLL.putInt("use_effect", 0);
        player.LJLJLJ(LIZLLL);
    }

    public final void LIZLLL(boolean z, Bundle bundle) {
        C46882Iac player;
        Object value = IZ8.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-OPEN_CROP_SR>(...)");
        if (!((Boolean) value).booleanValue() || (player = this.LJLILLLLZI.getPlayer()) == null) {
            return;
        }
        Bundle LIZLLL = C1DG.LIZLLL("action", 21, "effect_type", 11);
        if (z && bundle != null && bundle.containsKey("width") && bundle.containsKey("height") && bundle.containsKey("x") && bundle.containsKey("y")) {
            LIZLLL.putFloat("width", bundle.getFloat("width"));
            LIZLLL.putFloat("height", bundle.getFloat("height"));
            LIZLLL.putFloat("x", bundle.getFloat("x"));
            LIZLLL.putFloat("y", bundle.getFloat("y"));
            LIZLLL.putInt("use_effect", 1);
            LIZLLL.putInt("int_value", 1);
            player.LJLLLL(199, 1);
            this.LJLJI = true;
            player.LJLJLJ(LIZLLL);
            return;
        }
        if (!this.LJLJI) {
            return;
        }
        LIZLLL.putInt("int_value", 0);
        player.LJLJLJ(LIZLLL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (r3 == r2) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(boolean r22, android.os.Bundle r23) {
        /*
            r21 = this;
            r11 = r21
            X.IYm r0 = r11.LJLILLLLZI
            X.Iac r9 = r0.getPlayer()
            if (r9 != 0) goto Lb
            return
        Lb:
            r0 = 1
            r10 = r23
            if (r10 == 0) goto L12
            r11.LJLJJI = r0
        L12:
            java.lang.String r8 = "use_effect"
            r4 = 15
            java.lang.String r14 = "effect_type"
            r3 = 21
            java.lang.String r0 = "action"
            r2 = 0
            if (r10 != 0) goto L30
            boolean r1 = r11.LJLJJI
            if (r1 == 0) goto L2d
            android.os.Bundle r0 = X.C1DG.LIZLLL(r0, r3, r14, r4)
            r0.putInt(r8, r2)
            r9.LJLJLJ(r0)
        L2d:
            r11.LJLJJL = r10
            return
        L30:
            java.lang.String r12 = "repeat_type"
            java.lang.String r7 = "scale"
            java.lang.String r6 = "strength"
            java.lang.String r5 = "edge_size"
            java.lang.String r13 = "aspect_ratio"
            if (r22 != 0) goto L7b
            android.os.Bundle r1 = r11.LJLJJL
            if (r1 == 0) goto L7b
            float r20 = r1.getFloat(r13)
            float r19 = r1.getFloat(r5)
            float r18 = r1.getFloat(r6)
            float r17 = r1.getFloat(r7)
            int r3 = r1.getInt(r12)
            float r1 = r10.getFloat(r13)
            float r16 = r10.getFloat(r5)
            float r15 = r10.getFloat(r6)
            float r4 = r10.getFloat(r7)
            int r2 = r10.getInt(r12)
            int r1 = (r20 > r1 ? 1 : (r20 == r1 ? 0 : -1))
            if (r1 != 0) goto L7b
            int r1 = (r19 > r16 ? 1 : (r19 == r16 ? 0 : -1))
            if (r1 != 0) goto L7b
            int r1 = (r18 > r15 ? 1 : (r18 == r15 ? 0 : -1))
            if (r1 != 0) goto L7b
            int r1 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r1 != 0) goto L7b
            if (r3 != r2) goto L7b
            goto L2d
        L7b:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            float r17 = r10.getFloat(r13)
            float r16 = r10.getFloat(r5)
            float r3 = r10.getFloat(r6)
            float r2 = r10.getFloat(r7)
            int r1 = r10.getInt(r12)
            r15 = 21
            r4.putInt(r0, r15)
            r0 = 15
            r4.putInt(r14, r0)
            r0 = r17
            r4.putFloat(r13, r0)
            r0 = r16
            r4.putFloat(r5, r0)
            r4.putFloat(r6, r3)
            r4.putFloat(r7, r2)
            r4.putInt(r12, r1)
            r0 = 1
            r4.putInt(r8, r0)
            r9.LJLJLJ(r4)
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IZO.LJ(boolean, android.os.Bundle):void");
    }
}
