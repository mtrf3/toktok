package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GNz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41435GNz {
    public static List LIZ(AwemeDraft draft) {
        InfoStickerModel LJI;
        List<StickerItemModel> list;
        o.LJIIIZ(draft, "draft");
        if (draft.LJJJJI.isUpdateInfoStickers && draft != null && (LJI = draft.LJI()) != null && (list = LJI.stickers) != null) {
            ArrayList arrayList = new ArrayList();
            for (StickerItemModel stickerItemModel : list) {
                StickerItemModel stickerItemModel2 = stickerItemModel;
                if (stickerItemModel2.type == 0 && !TextUtils.isEmpty(stickerItemModel2.stickerId)) {
                    arrayList.add(stickerItemModel);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:(4:14|15|16|17)(2:11|12))(2:19|20))(3:27|28|(1:30))|21|(5:23|(1:25)|15|16|17)|26|16|17))|33|6|7|(0)(0)|21|(0)|26|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        X.H78.LIZJ("DraftBoxFragment : refreshDraftList , updateEffect --- resumeWithException : " + X.H78.LJFF(r2));
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:14:0x0053, B:15:0x0056, B:20:0x0040, B:21:0x0043, B:23:0x0047, B:28:0x0035), top: B:7:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C83309Wmn r7, java.util.List<? extends com.ss.android.ugc.aweme.editSticker.model.StickerItemModel> r8, X.InterfaceC67352kd<? super java.lang.Boolean> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C41434GNy
            if (r0 == 0) goto L21
            r5 = r9
            X.GNy r5 = (X.C41434GNy) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r2 = r5.LJLJJI
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L32
            if (r2 == r0) goto L2f
            if (r2 != r1) goto L27
            goto L53
        L21:
            X.GNy r5 = new X.GNy
            r5.<init>(r6, r9)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.Wmn r7 = r5.LJLIL
            goto L40
        L32:
            X.C141335gf.LIZJ(r4)
            r5.LJLIL = r7     // Catch: java.lang.Throwable -> L5d
            r5.LJLJJI = r0     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r4 = r7.LIZIZ(r8, r5)     // Catch: java.lang.Throwable -> L5d
            if (r4 != r3) goto L43
            return r3
        L40:
            X.C141335gf.LIZJ(r4)     // Catch: java.lang.Throwable -> L5d
        L43:
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L5d
            if (r4 == 0) goto L73
            r0 = 0
            r5.LJLIL = r0     // Catch: java.lang.Throwable -> L5d
            r5.LJLJJI = r1     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r4 = X.C83309Wmn.LIZ(r7, r4, r5)     // Catch: java.lang.Throwable -> L5d
            if (r4 != r3) goto L56
            return r3
        L53:
            X.C141335gf.LIZJ(r4)     // Catch: java.lang.Throwable -> L5d
        L56:
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L5d
            boolean r0 = r4.booleanValue()     // Catch: java.lang.Throwable -> L5d
            goto L74
        L5d:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "DraftBoxFragment : refreshDraftList , updateEffect --- resumeWithException : "
            r1.<init>(r0)
            java.lang.String r0 = X.H78.LJFF(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.H78.LIZJ(r0)
        L73:
            r0 = 0
        L74:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41435GNz.LIZIZ(X.Wmn, java.util.List, X.2kd):java.lang.Object");
    }
}
