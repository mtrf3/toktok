package X;

import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.dataChannel.AudienceShareScreenDefinition;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B9H implements Runnable {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ B9S LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    public B9H(boolean z, B9S b9s, int i, String str, String str2, int i2) {
        this.LJLIL = z;
        this.LJLILLLLZI = b9s;
        this.LJLJI = i;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = i2;
    }

    public final void LIZ() {
        InterfaceC28738BPq LIZIZ;
        if (this.LJLIL) {
            PushStreamInfo.Quality quality = new PushStreamInfo.Quality();
            quality.sdkKey = ((B9G) ListProtector.get(this.LJLILLLLZI.LJLILLLLZI, this.LJLJI)).LIZJ;
            quality.name = ((B9G) ListProtector.get(this.LJLILLLLZI.LJLILLLLZI, this.LJLJI)).LIZ;
            DataChannel dataChannel = this.LJLILLLLZI.LJLJJL;
            if (dataChannel != null) {
                dataChannel.rv0(AudienceShareScreenDefinition.class, quality);
            }
            if (C48189Ivh.LJI(C15380j0.LIZLLL())) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str = quality.name;
                o.LJIIIIZZ(str, "quality.name");
                linkedHashMap.put("name", str);
                String str2 = quality.sdkKey;
                o.LJIIIIZZ(str2, "quality.sdkKey");
                linkedHashMap.put("sdk_key", str2);
                InterfaceC30442Bx8.LLLZ.LIZ(linkedHashMap);
                if (!o.LJ("auto", quality.sdkKey) && (LIZIZ = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ(this.LJLJJI)) != null) {
                    LIZIZ.LIZJ(false);
                }
                this.LJLILLLLZI.LJZI(true, quality);
            } else {
                this.LJLILLLLZI.LJZI(false, quality);
            }
            B9S b9s = this.LJLILLLLZI;
            String str3 = quality.sdkKey;
            o.LJIIIIZZ(str3, "quality.sdkKey");
            b9s.LJLZ(str3, this.LJLJJL, false);
            this.LJLILLLLZI.LJZ(this.LJLJI);
            this.LJLILLLLZI.LJZL(this.LJLJJLL);
            B9S b9s2 = this.LJLILLLLZI;
            b9s2.LJLJL = this.LJLJI;
            b9s2.LJLJJLL.LLLLLJLJLL();
        }
        this.LJLILLLLZI.LJLJLLL = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
