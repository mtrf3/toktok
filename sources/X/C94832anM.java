package X;

import com.bytedance.effectcreatormobile.objectselect.prefab.PrefabViewModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.objectselect.prefab.PrefabViewModel$applyPrefab$1", f = "PrefabViewModel.kt", l = {280, 288, 294, 296, 299}, m = "invokeSuspend")
/* renamed from: X.anM, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94832anM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PrefabViewModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94832anM(PrefabViewModel prefabViewModel, String str, int i, String str2, String str3, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = prefabViewModel;
        this.LJLJI = str;
        this.LJLJJI = i;
        this.LJLJJL = str2;
        this.LJLJJLL = str3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94832anM(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00de A[Catch: Exception -> 0x00f6, TryCatch #0 {Exception -> 0x00f6, blocks: (B:15:0x001c, B:16:0x00d5, B:17:0x00d8, B:19:0x00de, B:23:0x005b, B:24:0x005e, B:26:0x0066, B:27:0x0069, B:29:0x006f, B:31:0x0077, B:33:0x007d, B:34:0x0080, B:36:0x0086, B:37:0x008b, B:39:0x0091, B:40:0x009d, B:42:0x00a3, B:44:0x00ab, B:49:0x00b9, B:51:0x00c5, B:60:0x004a), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[Catch: Exception -> 0x00f6, TryCatch #0 {Exception -> 0x00f6, blocks: (B:15:0x001c, B:16:0x00d5, B:17:0x00d8, B:19:0x00de, B:23:0x005b, B:24:0x005e, B:26:0x0066, B:27:0x0069, B:29:0x006f, B:31:0x0077, B:33:0x007d, B:34:0x0080, B:36:0x0086, B:37:0x008b, B:39:0x0091, B:40:0x009d, B:42:0x00a3, B:44:0x00ab, B:49:0x00b9, B:51:0x00c5, B:60:0x004a), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086 A[Catch: Exception -> 0x00f6, TryCatch #0 {Exception -> 0x00f6, blocks: (B:15:0x001c, B:16:0x00d5, B:17:0x00d8, B:19:0x00de, B:23:0x005b, B:24:0x005e, B:26:0x0066, B:27:0x0069, B:29:0x006f, B:31:0x0077, B:33:0x007d, B:34:0x0080, B:36:0x0086, B:37:0x008b, B:39:0x0091, B:40:0x009d, B:42:0x00a3, B:44:0x00ab, B:49:0x00b9, B:51:0x00c5, B:60:0x004a), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091 A[Catch: Exception -> 0x00f6, TryCatch #0 {Exception -> 0x00f6, blocks: (B:15:0x001c, B:16:0x00d5, B:17:0x00d8, B:19:0x00de, B:23:0x005b, B:24:0x005e, B:26:0x0066, B:27:0x0069, B:29:0x006f, B:31:0x0077, B:33:0x007d, B:34:0x0080, B:36:0x0086, B:37:0x008b, B:39:0x0091, B:40:0x009d, B:42:0x00a3, B:44:0x00ab, B:49:0x00b9, B:51:0x00c5, B:60:0x004a), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3 A[Catch: Exception -> 0x00f6, TryCatch #0 {Exception -> 0x00f6, blocks: (B:15:0x001c, B:16:0x00d5, B:17:0x00d8, B:19:0x00de, B:23:0x005b, B:24:0x005e, B:26:0x0066, B:27:0x0069, B:29:0x006f, B:31:0x0077, B:33:0x007d, B:34:0x0080, B:36:0x0086, B:37:0x008b, B:39:0x0091, B:40:0x009d, B:42:0x00a3, B:44:0x00ab, B:49:0x00b9, B:51:0x00c5, B:60:0x004a), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94832anM.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
