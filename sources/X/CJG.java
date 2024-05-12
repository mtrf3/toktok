package X;

import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.dataChannel.EmoteBitmapListChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CJG extends CJM<CJ9> {
    public final EmoteModel LJLIL;
    public final C31597Caf LJLILLLLZI;
    public final C47121t6 LJLJI;
    public final C47121t6 LJLJJI;
    public final C47061t0 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJG(View view, EmoteModel emote) {
        super(view);
        o.LJIIIZ(emote, "emote");
        this.LJLIL = emote;
        View findViewById = view.findViewById(R.id.exo);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_anchor_avatar)");
        this.LJLILLLLZI = (C31597Caf) findViewById;
        View findViewById2 = view.findViewById(R.id.lzl);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.tv_anchor)");
        this.LJLJI = (C47121t6) findViewById2;
        o.LJIIIIZZ(view.findViewById(R.id.mlm), "itemView.findViewById(R.id.tv_sub_only)");
        View findViewById3 = view.findViewById(R.id.m4n);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.tv_desc)");
        this.LJLJJI = (C47121t6) findViewById3;
        View findViewById4 = view.findViewById(R.id.f2j);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.iv_emote)");
        this.LJLJJL = (C47061t0) findViewById4;
    }

    @Override // X.CJM
    public final void L(int i, Object obj) {
        CJ9 data = (CJ9) obj;
        o.LJIIIZ(data, "data");
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room == null) {
            return;
        }
        C31665Cbl.LJIIJ(this.LJLILLLLZI, room.getOwner().getAvatarThumb(), this.LJLILLLLZI.getWidth(), this.LJLILLLLZI.getHeight(), R.drawable.cuk);
        String LIZ = C05170If.LIZ(room.getOwner());
        int i2 = 0;
        this.LJLJI.setText(C15380j0.LJIILL(R.string.obd, LIZ));
        C47121t6 c47121t6 = this.LJLJJI;
        Object[] objArr = new Object[2];
        objArr[0] = LIZ;
        List list = (List) dataChannelGlobal.mv0(EmoteBitmapListChannel.class);
        if (list != null) {
            i2 = list.size();
        }
        objArr[1] = Integer.valueOf(i2);
        c47121t6.setText(C15380j0.LJIILL(R.string.obc, objArr));
        if (data.LJLJI) {
            C47121t6 c47121t62 = this.LJLJJI;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append((Object) this.LJLJJI.getText());
            LIZ2.append('\n');
            LIZ2.append(C15380j0.LJIILJJIL(R.string.oj5));
            c47121t62.setText(X1D.LIZIZ(LIZ2));
        }
        ImageModel imageModel = this.LJLIL.image;
        if (imageModel == null) {
            return;
        }
        C31665Cbl.LJ(imageModel, this.LJLJJL);
    }
}
