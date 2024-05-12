package X;

import Y.AObjectS52S0101000_7;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.zhiliaoapp.musically.R;

/* renamed from: X.MUl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56891MUl extends MVV {
    public final TextView LJLIL;
    public final Context LJLILLLLZI;
    public final C56892MUm LJLJI;

    @Override // X.MVV
    public final int getRootId() {
        return R.id.h5p;
    }

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final boolean needLongClick() {
        return false;
    }

    @Override // X.MVV
    public final void reportShowEvent() {
        super.reportShowEvent();
        InterfaceC56771MPv interfaceC56771MPv = this.vm;
        if (interfaceC56771MPv != null) {
            interfaceC56771MPv.vP(this.mMTBaseNotice, new AObjectS52S0101000_7(1, this, 18));
        }
    }

    public C56891MUl(View view) {
        super(view);
        this.LJLILLLLZI = view.getContext();
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.h5p);
        C119624mk c119624mk = (C119624mk) view.findViewById(R.id.euc);
        view.findViewById(R.id.eud);
        this.LJLIL = (TextView) view.findViewById(R.id.h4l);
        SY4 sy4 = (SY4) view.findViewById(R.id.h4i);
        C56812MRk.LIZ(constraintLayout);
        C56812MRk.LIZ(c119624mk);
        C56812MRk.LIZ(sy4);
        C16880lQ.LJJIZ(sy4, this);
        C16880lQ.LJIL(constraintLayout, this);
        C16880lQ.LJJJJIZL(c119624mk, this);
        C56892MUm c56892MUm = new C56892MUm();
        this.LJLJI = c56892MUm;
        c56892MUm.LIZIZ = (C119624mk) constraintLayout.findViewById(R.id.euc);
        c56892MUm.LIZ = (C5FU) constraintLayout.findViewById(R.id.eud);
    }

    public static /* synthetic */ void M(C56891MUl c56891MUl) {
        String accountType = c56891MUl.mMTBaseNotice.getAccountType();
        int i = ((ViewOnClickListenerC56908MVc) c56891MUl).mPosition;
        String str = c56891MUl.mTimelineTypeStr;
        int az = c56891MUl.vm.az();
        BaseNotice baseNotice = c56891MUl.mMTBaseNotice;
        C56760MPk.LJII(accountType, i, str, az, baseNotice.nid, Integer.valueOf(baseNotice.hasRead ? 1 : 0), null, c56891MUl.mMTBaseNotice.templateId, c56891MUl.vm.Kg0());
    }

    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    public final void onClick(View view) {
        EF7.LIZIZ();
        if (C2NU.LIZ.LIZIZ()) {
            int id = view.getId();
            if (id == R.id.h5p || id == R.id.h4i || id == R.id.euc || id == R.id.eud) {
                logNotificationClick(this.mMTBaseNotice.getAccountType(), getLayoutPosition());
                EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                enterRoomConfig.mRoomsData.fromNewStyle = true;
                C78688UuS.LJJJJL("message");
                LogHelperImpl.LJIIIIZZ().LIZIZ();
                LiveOuterService.LJJJLL().LJIILL();
                C78461Uqn.LIZIZ(this.LJLILLLLZI, enterRoomConfig, "message");
                return;
            }
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(this.itemView);
        c26045AKb.LJIIIIZZ(R.string.img);
        c26045AKb.LJIIJ();
    }
}
