package X;

import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.JpH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50339JpH extends C50340JpI {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50339JpH(InterfaceC60761Nsz lynxKitView) {
        super(lynxKitView);
        o.LJIIIZ(lynxKitView, "lynxKitView");
    }

    @Override // X.C50340JpI
    public final void LIZIZ(TemplateData data) {
        o.LJIIIZ(data, "data");
        C50069Jkv c50069Jkv = (C50069Jkv) this.LIZ.getHybridContext().LIZIZ(C50069Jkv.class);
        if (c50069Jkv != null && c50069Jkv.LJLIL) {
            Object obj = this.LIZ;
            o.LJII(obj, "null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
            ((VNS) obj).updateData(data);
            return;
        }
        super.LIZIZ(data);
    }

    @Override // X.C50340JpI
    public final void LIZJ(DynamicPatch dynamicPatch) {
        C50069Jkv c50069Jkv = (C50069Jkv) this.LIZ.getHybridContext().LIZIZ(C50069Jkv.class);
        if (c50069Jkv != null && c50069Jkv.LJLIL) {
            Object obj = this.LIZ;
            o.LJII(obj, "null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
            C50336JpE c50336JpE = C50336JpE.LJI;
            C60737Nsb hybridContext = this.LIZ.getHybridContext();
            c50336JpE.getClass();
            ((VNS) obj).updateData(C50336JpE.LIZJ(dynamicPatch, null, hybridContext));
            return;
        }
        super.LIZJ(dynamicPatch);
    }

    @Override // X.C50340JpI
    public final void LIZLLL(String raw) {
        o.LJIIIZ(raw, "raw");
        C50069Jkv c50069Jkv = (C50069Jkv) this.LIZ.getHybridContext().LIZIZ(C50069Jkv.class);
        if (c50069Jkv != null && c50069Jkv.LJLIL) {
            Object obj = this.LIZ;
            o.LJII(obj, "null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
            C50336JpE c50336JpE = C50336JpE.LJI;
            C60737Nsb hybridContext = this.LIZ.getHybridContext();
            c50336JpE.getClass();
            ((VNS) obj).updateData(C50336JpE.LIZLLL(raw, null, hybridContext));
            return;
        }
        super.LIZLLL(raw);
    }

    @Override // X.C50340JpI
    public final void LIZ(String str, JSONObject params) {
        boolean z;
        EnumC50341JpJ enumC50341JpJ;
        o.LJIIIZ(params, "params");
        C50069Jkv c50069Jkv = (C50069Jkv) this.LIZ.getHybridContext().LIZIZ(C50069Jkv.class);
        if (c50069Jkv != null) {
            z = c50069Jkv.LJLIL;
        } else {
            z = false;
        }
        C50338JpG c50338JpG = C50338JpG.LJI;
        c50338JpG.getClass();
        if (c50338JpG.LIZ.contains(str)) {
            enumC50341JpJ = EnumC50341JpJ.STABLE;
        } else if (c50338JpG.LIZIZ.contains(str)) {
            enumC50341JpJ = EnumC50341JpJ.EXPERIMENTAL;
        } else {
            enumC50341JpJ = EnumC50341JpJ.DEPRECATED;
        }
        if (z && enumC50341JpJ == EnumC50341JpJ.DEPRECATED) {
            C15280iq.LIZIZ("SparkInfo", "strict: remove debug mode event to fe to new container");
        } else {
            super.LIZ(str, params);
        }
    }
}
