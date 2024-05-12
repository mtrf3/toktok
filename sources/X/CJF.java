package X;

import Y.ACListenerS25S0100000_5;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.dataChannel.EmoteBitmapListChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CJF extends CJM<CJ9> {
    public final CJP LJLIL;
    public final C47121t6 LJLILLLLZI;
    public final C31597Caf LJLJI;
    public final C47121t6 LJLJJI;
    public final C47121t6 LJLJJL;
    public final C2A7 LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJF(View view, CJP subBtnClickListener) {
        super(view);
        o.LJIIIZ(subBtnClickListener, "subBtnClickListener");
        this.LJLIL = subBtnClickListener;
        View findViewById = view.findViewById(R.id.m72);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tv_follow_desc)");
        this.LJLILLLLZI = (C47121t6) findViewById;
        View findViewById2 = view.findViewById(R.id.f4p);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.iv_host_avatar)");
        this.LJLJI = (C31597Caf) findViewById2;
        View findViewById3 = view.findViewById(R.id.mpz);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.tv_user_name)");
        this.LJLJJI = (C47121t6) findViewById3;
        View findViewById4 = view.findViewById(R.id.m4u);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.tv_description)");
        this.LJLJJL = (C47121t6) findViewById4;
        View findViewById5 = view.findViewById(R.id.azj);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.btn_subscribe)");
        this.LJLJJLL = (C2A7) findViewById5;
    }

    @Override // X.CJM
    public final void L(int i, Object obj) {
        int i2;
        int i3;
        CJ9 data = (CJ9) obj;
        o.LJIIIZ(data, "data");
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room == null) {
            return;
        }
        C31665Cbl.LJIIJ(this.LJLJI, room.getOwner().getAvatarThumb(), this.LJLJI.getWidth(), this.LJLJI.getHeight(), R.drawable.cuk);
        ViewGroup.LayoutParams layoutParams = this.LJLILLLLZI.getLayoutParams();
        layoutParams.width = C15380j0.LJIIL();
        this.LJLILLLLZI.setLayoutParams(layoutParams);
        String LIZ = C05170If.LIZ(room.getOwner());
        this.LJLJJI.setText(LIZ);
        C47121t6 c47121t6 = this.LJLJJL;
        Resources resources = c47121t6.getContext().getResources();
        List list = (List) dataChannelGlobal.mv0(EmoteBitmapListChannel.class);
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        Object[] objArr = new Object[2];
        objArr[0] = LIZ;
        List list2 = (List) dataChannelGlobal.mv0(EmoteBitmapListChannel.class);
        if (list2 != null) {
            i3 = list2.size();
        } else {
            i3 = 0;
        }
        objArr[1] = Integer.valueOf(i3);
        c47121t6.setText(resources.getQuantityString(R.plurals.pi, i2, objArr));
        if (!data.LJLILLLLZI) {
            this.LJLJJLL.setEnabled(true);
            this.LJLJJLL.setVisibility(0);
        }
        this.LJLILLLLZI.setVisibility(8);
        C16880lQ.LJJIII(this.LJLJJLL, new ACListenerS25S0100000_5(this, 380));
    }
}
