package X;

import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.FakeMessageViewModel;

/* renamed from: X.2z1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C76272z1 extends TBS implements InterfaceC88471Ynr<String, Integer, C76800UCe> {
    public C76272z1(Object obj) {
        super(2, obj, ViewOnClickListenerC85343Wo.class, "onFollowStatusChanged", "onFollowStatusChanged(Ljava/lang/String;I)V", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(String str, Integer num) {
        String str2 = str;
        int intValue = num.intValue();
        FakeMessageViewModel fakeMessageViewModel = ((AbstractC779033y) this.receiver).LLIIIILZ;
        if (fakeMessageViewModel != null && str2 != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onFollowStatusChanged: userId=");
            LIZ.append(str2);
            LIZ.append(", status=");
            LIZ.append(intValue);
            C34B.LJI("UserRecCardViewModel", X1D.LIZIZ(LIZ));
            fakeMessageViewModel.LJLJJLL.put(str2, Integer.valueOf(intValue));
            if (fakeMessageViewModel.LJLJJL.containsKey(str2)) {
                if (intValue == EnumC57435MgR.UNFOLLOW.getValue()) {
                    C34B.LJI("UserRecCardViewModel", "onFollowStatusChanged: remove job");
                    InterfaceC79150V4o remove = fakeMessageViewModel.LJLJJL.remove(str2);
                    if (remove != null) {
                        remove.LIZIZ(null);
                    }
                } else {
                    C34B.LJI("UserRecCardViewModel", "onFollowStatusChanged: waiting pending job");
                }
            } else if (intValue != EnumC57435MgR.UNFOLLOW.getValue()) {
                InterfaceC68952nD interfaceC68952nD = fakeMessageViewModel.LJLJJI;
                if (interfaceC68952nD != null) {
                    interfaceC68952nD.w(str2, false, false);
                }
                C76212yv.LIZIZ();
            }
        }
        return C76800UCe.LIZ;
    }
}
