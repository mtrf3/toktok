package X;

import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.7gK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C192087gK extends TBS implements InterfaceC88473Ynt<String, Object, EnumC84576XHg, C76800UCe> {
    public C192087gK(Object obj) {
        super(3, obj, CollectionContentFragment.class, "onCollectionStateChange", "onCollectionStateChange(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/mota/storage/motacache/StorageOperation;)V", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(String str, Object obj, EnumC84576XHg enumC84576XHg) {
        String p0 = str;
        EnumC84576XHg p2 = enumC84576XHg;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p2, "p2");
        ((CollectionContentFragment) this.receiver).Ol(p0, obj, p2);
        return C76800UCe.LIZ;
    }
}
