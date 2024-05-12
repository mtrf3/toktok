package X;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.model.GroupInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.4Yo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111344Yo extends AbstractSavedStateViewModelFactory {
    public final /* synthetic */ InterfaceC111364Yq LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ GroupInfo LIZJ;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final <T extends ViewModel> T create(String key, Class<T> modelClass, SavedStateHandle handle) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(modelClass, "modelClass");
        o.LJIIIZ(handle, "handle");
        new PO8("ChatGroupInvite::GroupInviteViewModelFactory").d("create: GroupInviteViewModelNewFactory");
        GroupInviteViewModel LIZ = this.LIZ.LIZ(this.LIZIZ, this.LIZJ);
        o.LJII(LIZ, "null cannot be cast to non-null type T of com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel.Companion.provideFactory.<no name provided>.create");
        return LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C111344Yo(Bundle bundle, InterfaceC36571c5 interfaceC36571c5, InterfaceC111364Yq interfaceC111364Yq, GroupInfo groupInfo, String str) {
        super(interfaceC36571c5, bundle);
        this.LIZ = interfaceC111364Yq;
        this.LIZIZ = str;
        this.LIZJ = groupInfo;
    }
}
