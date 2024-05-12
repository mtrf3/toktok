package X;

import Y.ARunnableS12S0300000_1;
import Y.IDcS135S0200000_1;
import android.app.Activity;
import android.os.Handler;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3TZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3TZ extends AbstractC785136h {
    public static final /* synthetic */ int LJLL = 0;
    public final int LJLJL;
    public final int LJLJLJ;
    public final int LJLJLLL;

    @Override // X.AbstractC785136h
    public final int LIZLLL() {
        return 0;
    }

    @Override // X.AbstractC785136h
    public final void LIZ() {
        EnumC96103pu enumC96103pu;
        int i = this.LJLJL;
        EnumC96103pu enumC96103pu2 = EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_PRIMARY;
        if (i == enumC96103pu2.getValue()) {
            enumC96103pu = EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_SECONDARY;
        } else {
            enumC96103pu = EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_SECONDARY;
            if (i == enumC96103pu.getValue()) {
                enumC96103pu = enumC96103pu2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("current category: ");
        LIZ.append(this.LJLJL);
        LIZ.append("  targetCategory: ");
        LIZ.append(enumC96103pu);
        C34B.LIZIZ("CategoryAction", X1D.LIZIZ(LIZ));
        this.LJLILLLLZI.LIZIZ(enumC96103pu, new IDcS135S0200000_1(enumC96103pu, this, 15));
        if (enumC96103pu == enumC96103pu2) {
            C3TV.LIZLLL(C3TV.LIZ, "primary", this.LJLJI.LJIIIIZZ(), this.LJLJI.LJLLLLLL);
        } else {
            if (enumC96103pu != EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_SECONDARY) {
                return;
            }
            C3TV.LIZLLL(C3TV.LIZ, "secondary", this.LJLJI.LJIIIIZZ(), this.LJLJI.LJLLLLLL);
        }
    }

    @Override // X.AbstractC785136h
    public final boolean LJ() {
        C63120Opw LIZLLL;
        if (!C55888Lwa.LIZIZ.LJJI(true)) {
            return true;
        }
        if ((C3U8.LIZ() && this.LJLJI.LLI) || (LIZLLL = this.LJLILLLLZI.LIZLLL()) == null || LIZLLL.isStranger()) {
            return true;
        }
        return false;
    }

    public final void LJFF() {
        if (C4VT.LIZIZ() && C73340SqO.LJJIJ(this.LJLIL)) {
            C34B.LIZIZ("CategoryAction", "activity available");
            INetworkStandardUIService createINetworkStandardUIServicebyMonsterPlugin = NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false);
            o.LJIIIIZZ(createINetworkStandardUIServicebyMonsterPlugin, "get().getService(INetwor…ardUIService::class.java)");
            InterfaceC84463Te networkStateForSharePanel = createINetworkStandardUIServicebyMonsterPlugin.getNetworkStateForSharePanel();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("networkState: ");
            LIZ.append(networkStateForSharePanel);
            C34B.LIZIZ("CategoryAction", X1D.LIZIZ(LIZ));
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS12S0300000_1(networkStateForSharePanel, createINetworkStandardUIServicebyMonsterPlugin, this, 19));
        }
    }

    @Override // X.AbstractC785136h
    public final int LIZIZ() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC785136h
    public final int LIZJ() {
        return this.LJLJLJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3TZ(Activity activity, AbstractC90763hI conversationModel, C3L4 session) {
        super(activity, conversationModel, session);
        int i;
        C3L5 c3l5;
        EnumC96103pu enumC96103pu;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(conversationModel, "conversationModel");
        o.LJIIIZ(session, "session");
        int value = ((!(session instanceof C3L5) || (c3l5 = (C3L5) session) == null || (enumC96103pu = c3l5.LLIIII) == null) ? EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_PRIMARY : enumC96103pu).getValue();
        this.LJLJL = value;
        if (value == EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_PRIMARY.getValue()) {
            i = R.string.e_d;
        } else if (value == EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_SECONDARY.getValue()) {
            i = R.string.e_c;
        } else {
            i = R.string.h5a;
        }
        this.LJLJLJ = i;
        this.LJLJLLL = R.raw.icon_person_arrow_left_right;
    }
}
