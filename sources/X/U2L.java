package X;

import Y.ACListenerS33S0100000_13;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U2L extends AbstractDialogC29234Bde {
    public final long LJLJI;
    public final long LJLJJI;
    public final Room LJLJJL;
    public final DataChannel LJLJJLL;
    public ImageView LJLJL;
    public ImageView LJLJLJ;
    public C47121t6 LJLJLLL;
    public C47121t6 LJLL;
    public C2A7 LJLLI;
    public View LJLLILLLL;
    public Gift LJLLJ;

    @Override // X.AbstractDialogC29234Bde
    public final int LJJIIJ() {
        return R.layout.cz3;
    }

    public final void LJJIIJZLJL() {
        Long l;
        Gift gift = this.LJLLJ;
        if (gift != null) {
            l = Long.valueOf(gift.id);
        } else {
            l = null;
        }
        Room room = this.LJLJJL;
        DataChannel dataChannel = this.LJLJJLL;
        if (l != null && room != null && dataChannel != null) {
            Object value = C8E.LJ.getValue();
            o.LJIIIIZZ(value, "<get-giftService>(...)");
            ((IGiftService) value).sendGiftForBecomeGuest(l.longValue(), room, dataChannel);
        }
    }

    @Override // X.AbstractDialogC29234Bde, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        List<String> list;
        String str;
        String str2;
        ImageModel imageModel;
        ImageModel avatarThumb;
        super.onCreate(bundle);
        this.LJLJL = (ImageView) findViewById(R.id.dwm);
        this.LJLJLJ = (ImageView) findViewById(R.id.dwk);
        this.LJLJLLL = (C47121t6) findViewById(R.id.dwi);
        this.LJLL = (C47121t6) findViewById(R.id.dwf);
        this.LJLLI = (C2A7) findViewById(R.id.dwn);
        this.LJLLILLLL = findViewById(R.id.dwc);
        Object value = C8E.LJ.getValue();
        o.LJIIIIZZ(value, "<get-giftService>(...)");
        this.LJLLJ = ((IGiftService) value).findClosetGift((int) (this.LJLJJI - this.LJLJI));
        BQO LIZ = C15650jR.LIZ();
        User LIZIZ = C05200Ii.LIZIZ();
        List<String> list2 = null;
        if (LIZIZ != null && (avatarThumb = LIZIZ.getAvatarThumb()) != null) {
            list = avatarThumb.mUrls;
        } else {
            list = null;
        }
        C78720Uuy LIZ2 = LIZ.LIZ(list);
        Boolean bool = Boolean.TRUE;
        LIZ2.LJIIL = bool;
        LIZ2.LJIIIIZZ = R.drawable.cuk;
        LIZ2.LJIIJJI(this.LJLJL);
        BQO LIZ3 = C15650jR.LIZ();
        Gift gift = this.LJLLJ;
        if (gift != null && (imageModel = gift.image) != null) {
            list2 = imageModel.getUrls();
        }
        C78720Uuy LIZ4 = LIZ3.LIZ(list2);
        LIZ4.LJIIL = bool;
        LIZ4.LJIIIIZZ = R.drawable.cuk;
        LIZ4.LJIIJJI(this.LJLJLJ);
        C47121t6 c47121t6 = this.LJLL;
        if (c47121t6 != null) {
            Gift gift2 = this.LJLLJ;
            if (gift2 == null || (str = Integer.valueOf(gift2.diamondCount).toString()) == null) {
                str = "";
            }
            c47121t6.setText(str);
        }
        String LJII = C15380j0.LJII(R.plurals.nq, (int) (this.LJLJJI - this.LJLJI));
        o.LJIIIIZZ(LJII, "getQuantityString(\n     …e).toInt(),\n            )");
        String LIZIZ2 = Q8U.LIZIZ(new Object[]{Long.valueOf(this.LJLJJI)}, 1, LJII, "format(format, *args)");
        C47121t6 c47121t62 = this.LJLJLLL;
        if (c47121t62 != null) {
            String LJII2 = C15380j0.LJII(R.plurals.no, (int) this.LJLJI);
            o.LJIIIIZZ(LJII2, "getQuantityString(\n     …re.toInt(),\n            )");
            String LLLZ = C16880lQ.LLLZ(LJII2, Arrays.copyOf(new Object[]{Long.valueOf(this.LJLJI), LIZIZ2}, 2));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            c47121t62.setText(LLLZ);
        }
        C2A7 c2a7 = this.LJLLI;
        if (c2a7 != null) {
            C16880lQ.LJJIII(c2a7, new ACListenerS33S0100000_13(this, 150));
        }
        View view = this.LJLLILLLL;
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 151), view);
        }
        Gift gift3 = this.LJLLJ;
        if (gift3 == null || (str2 = Long.valueOf(gift3.id).toString()) == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        C74824TYe.LJLJI(str2, String.valueOf(this.LJLJJI - this.LJLJI), "show", "first");
    }

    public U2L(Context context, long j, long j2, Room room, DataChannel dataChannel) {
        super(context);
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = room;
        this.LJLJJLL = dataChannel;
    }
}
