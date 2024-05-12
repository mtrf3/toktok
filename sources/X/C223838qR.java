package X;

import Y.ARunnableS22S0200000_3;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8qR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223838qR extends AbstractC221838nD {
    public final void LJIIIZ(View view) {
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            view.post(new ARunnableS22S0200000_3(this, view, 2));
        } else {
            LJIIL(view);
        }
    }

    public final void LJIIL(View view) {
        List<NormalTrackTimeStamp> LIZIZ;
        NormalTrackTimeStamp normalTrackTimeStamp;
        if (view.getWidth() == 0 || view.getHeight() == 0 || (LIZIZ = C223998qh.LIZIZ(this.LJLJI)) == null || (normalTrackTimeStamp = (NormalTrackTimeStamp) ListProtector.get(LIZIZ, 0)) == null) {
            return;
        }
        RectF LIZ = LIZ(normalTrackTimeStamp);
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        view.setTranslationX(((LIZ.width() - view.getWidth()) / 2.0f) + LIZ.left);
        view.setTranslationY(((LIZ.height() - view.getHeight()) / 2.0f) + LIZ.top);
        view.setScaleX(LIZ.width() / view.getWidth());
        view.setScaleY(LIZ.width() / view.getWidth());
        view.setRotation(normalTrackTimeStamp.getRotation());
        view.setVisibility(0);
        view.invalidate();
    }

    @Override // X.AbstractC221838nD
    public final List<NormalTrackTimeStamp> LIZIZ(long j, InteractStickerStruct stickerStruct) {
        o.LJIIIZ(stickerStruct, "stickerStruct");
        return C223998qh.LIZJ(j, stickerStruct);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005b A[Catch: s -> 0x008b, TryCatch #0 {s -> 0x008b, blocks: (B:7:0x0022, B:9:0x002b, B:11:0x0031, B:12:0x0035, B:14:0x003d, B:16:0x0043, B:17:0x0047, B:19:0x004b, B:21:0x004f, B:22:0x0051, B:24:0x0055, B:25:0x0057, B:27:0x005b, B:28:0x005d, B:30:0x0066, B:32:0x006a, B:34:0x006e, B:35:0x0070, B:36:0x0073), top: B:6:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066 A[Catch: s -> 0x008b, TryCatch #0 {s -> 0x008b, blocks: (B:7:0x0022, B:9:0x002b, B:11:0x0031, B:12:0x0035, B:14:0x003d, B:16:0x0043, B:17:0x0047, B:19:0x004b, B:21:0x004f, B:22:0x0051, B:24:0x0055, B:25:0x0057, B:27:0x005b, B:28:0x005d, B:30:0x0066, B:32:0x006a, B:34:0x006e, B:35:0x0070, B:36:0x0073), top: B:6:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    @Override // X.AbstractC221838nD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(float r8, float r9, X.InterfaceC221818nB r10) {
        /*
            r7 = this;
            java.lang.String r0 = "popListener"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            X.8ql r1 = r7.LJLILLLLZI
            r0 = 23
            android.view.View r0 = r1.LIZ(r0)
            boolean r0 = X.C6ZT.LIZ(r0)
            if (r0 == 0) goto L14
            return
        L14:
            X.8qG r1 = new X.8qG
            X.8ql r0 = r7.LJLILLLLZI
            int r0 = r0.hashCode()
            r1.<init>(r0)
            X.C2U8.LIZ(r1)
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r0 = r7.LJLJI     // Catch: com.google.gson.s -> L8b
            com.ss.android.ugc.aweme.sticker.data.NatureClassificationStickerStruct r0 = r0.getNatureClassificationStickerStruct()     // Catch: com.google.gson.s -> L8b
            r5 = 0
            if (r0 == 0) goto L89
            com.ss.android.ugc.aweme.sticker.data.NatureClassificationStruct r0 = r0.getNatureClassificationStruct()     // Catch: com.google.gson.s -> L8b
            if (r0 == 0) goto L89
            java.lang.String r6 = r0.getSpeciesName()     // Catch: com.google.gson.s -> L8b
        L35:
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r0 = r7.LJLJI     // Catch: com.google.gson.s -> L8b
            com.ss.android.ugc.aweme.sticker.data.NatureClassificationStickerStruct r0 = r0.getNatureClassificationStickerStruct()     // Catch: com.google.gson.s -> L8b
            if (r0 == 0) goto L87
            com.ss.android.ugc.aweme.sticker.data.NatureClassificationStruct r0 = r0.getNatureClassificationStruct()     // Catch: com.google.gson.s -> L8b
            if (r0 == 0) goto L87
            java.lang.String r4 = r0.getRedirectionSchema()     // Catch: com.google.gson.s -> L8b
        L47:
            X.9kW r3 = r7.LJLJJI     // Catch: com.google.gson.s -> L8b
            if (r3 == 0) goto L7d
            X.8qL r0 = r3.LJIIZILJ     // Catch: com.google.gson.s -> L8b
            if (r0 == 0) goto L7d
            java.lang.String r2 = r0.LIZIZ     // Catch: com.google.gson.s -> L8b
        L51:
            X.8qL r0 = r3.LJIIZILJ     // Catch: com.google.gson.s -> L8b
            if (r0 == 0) goto L81
            java.lang.String r1 = r0.LIZJ     // Catch: com.google.gson.s -> L8b
        L57:
            X.8qL r0 = r3.LJIIZILJ     // Catch: com.google.gson.s -> L8b
            if (r0 == 0) goto L85
            java.lang.String r0 = r0.LIZ     // Catch: com.google.gson.s -> L8b
        L5d:
            LJIIIIZZ(r2, r1, r0, r6)     // Catch: com.google.gson.s -> L8b
            com.ss.android.ugc.aweme.services.sticker.INatureGuideFragmentService r1 = com.ss.android.ugc.gamora.editor.sticker.nature.NatureGuideFragmentServiceImpl.LIZ()     // Catch: com.google.gson.s -> L8b
            if (r1 == 0) goto L73
            X.9kW r0 = r7.LJLJJI     // Catch: com.google.gson.s -> L8b
            if (r0 == 0) goto L70
            X.8qL r0 = r0.LJIIZILJ     // Catch: com.google.gson.s -> L8b
            if (r0 == 0) goto L70
            java.lang.String r5 = r0.LIZ     // Catch: com.google.gson.s -> L8b
        L70:
            r1.mobNatureGuideFragmentShow(r5)     // Catch: com.google.gson.s -> L8b
        L73:
            android.content.Context r0 = r7.LJLIL     // Catch: com.google.gson.s -> L8b
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r0, r4)     // Catch: com.google.gson.s -> L8b
            r0.open()     // Catch: com.google.gson.s -> L8b
            goto L8f
        L7d:
            r2 = r5
            if (r3 == 0) goto L81
            goto L51
        L81:
            r1 = r5
            if (r3 == 0) goto L85
            goto L57
        L85:
            r0 = r5
            goto L5d
        L87:
            r4 = r5
            goto L47
        L89:
            r6 = r5
            goto L35
        L8b:
            r0 = move-exception
            X.C36922EeM.LJFF(r0)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223838qR.LIZJ(float, float, X.8nB):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C223838qR(Context context, C223848qS view, InteractStickerStruct stickerStruct, C245649kW c245649kW) {
        super(context, view, stickerStruct, c245649kW);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(stickerStruct, "stickerStruct");
    }

    public static void LJIIIIZZ(String str, String str2, String str3, String str4) {
        C188727au LJIIIIZZ = JBR.LJIIIIZZ("author_id", str, "group_id", str2);
        LJIIIIZZ.LJI("sticker_type", "nature");
        LJIIIIZZ.LJI("enter_from", str3);
        LJIIIIZZ.LJI("name", str4);
        FMX.LJIIL("sticker_click", LJIIIIZZ.LIZ);
    }
}
