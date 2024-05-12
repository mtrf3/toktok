package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFragment$onViewCreated$2", f = "LiquefyFragment.kt", l = {83, LiveAnchorEnableInnerBeautyMaxValue.DEFAULT, 86, 88}, m = "invokeSuspend")
/* renamed from: X.alz, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94747alz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ Bundle LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94747alz(Bundle bundle, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = bundle;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94747alz(this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLIL
            r5 = 4
            r3 = 3
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L18
            if (r0 == r2) goto L4d
            if (r0 == r1) goto L3b
            if (r0 == r3) goto L4d
            if (r0 != r5) goto L5d
            X.C141335gf.LIZJ(r7)
        L15:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L18:
            X.C141335gf.LIZJ(r7)
            android.os.Bundle r0 = r6.LJLILLLLZI
            if (r0 != 0) goto L2e
            com.bytedance.effectcreatormobile.assetEditor.AssetEditorImpl r1 = X.C93977aZZ.LIZIZ()
            X.aZa r0 = X.EnumC93978aZa.ENTER_EDIT_MODE
            r6.LJLIL = r2
            java.lang.Object r0 = r1.emitEditEvent(r0, r6)
            if (r0 != r4) goto L50
            return r4
        L2e:
            com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender r0 = X.C93939aYx.LIZ()
            r6.LJLIL = r1
            java.lang.Object r0 = r0.awaitAlgorithm(r2, r6)
            if (r0 != r4) goto L3e
            return r4
        L3b:
            X.C141335gf.LIZJ(r7)
        L3e:
            com.bytedance.effectcreatormobile.assetEditor.AssetEditorImpl r1 = X.C93977aZZ.LIZIZ()
            X.aZa r0 = X.EnumC93978aZa.ENTER_EDIT_MODE
            r6.LJLIL = r3
            java.lang.Object r0 = r1.emitEditEvent(r0, r6)
            if (r0 != r4) goto L50
            return r4
        L4d:
            X.C141335gf.LIZJ(r7)
        L50:
            com.bytedance.effectcreatormobile.assetEditor.AssetEditorImpl r0 = X.C93977aZZ.LIZIZ()
            r6.LJLIL = r5
            java.lang.Object r0 = r0.emitFocusState(r2, r6)
            if (r0 != r4) goto L15
            return r4
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94747alz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
