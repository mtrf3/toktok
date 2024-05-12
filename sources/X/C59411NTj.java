package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.commercialize.live.service.CommercializeLiveServiceImpl;
import com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PromoteEntrySchemaModel;
import com.ss.android.ugc.aweme.feed.model.PromoteIconFlipFrequencySettingsModel;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NTj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59411NTj implements ICommercializeLiveService {
    public static final C59411NTj LIZIZ = new C59411NTj();
    public final /* synthetic */ ICommercializeLiveService LIZ = CommercializeLiveServiceImpl.LJJIIJZLJL();

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LIZ(JSONObject params) {
        o.LJIIIZ(params, "params");
        this.LIZ.LIZ(params);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final int LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LIZJ(Context context, Aweme aweme, int i, User user) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        this.LIZ.LIZJ(context, aweme, i, user);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LIZLLL(Aweme aweme, EnterRoomConfig enterRoomConfig, int i) {
        o.LJIIIZ(aweme, "aweme");
        this.LIZ.LIZLLL(aweme, enterRoomConfig, i);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final boolean LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJFF(Context context, AqS134S0200000_3 aqS134S0200000_3) {
        this.LIZ.LJFF(context, aqS134S0200000_3);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJI(Aweme aweme) {
        this.LIZ.LJI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final InterfaceC37276Ek4 LJII(int i, String roomId, String str, long j, String str2) {
        o.LJIIIZ(roomId, "roomId");
        return this.LIZ.LJII(i, roomId, str, j, str2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJIIIIZZ() {
        this.LIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final boolean LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJIIJ(Context context, String str) {
        o.LJIIIZ(context, "context");
        this.LIZ.LJIIJ(context, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final InterfaceC59736NcS LJIIJJI(FrameLayout frameLayout) {
        return this.LIZ.LJIIJJI(frameLayout);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final InterfaceC59337NQn LJIIL(FrameLayout frameLayout) {
        return this.LIZ.LJIIL(frameLayout);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final boolean LJIILIIL(Aweme aweme) {
        return this.LIZ.LJIILIIL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJIILJJIL(JSONObject params) {
        o.LJIIIZ(params, "params");
        this.LIZ.LJIILJJIL(params);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final AdLiveEnterRoomConfig LJIILL(Aweme aweme, AwemeRawAd awemeRawAd, int i) {
        o.LJIIIZ(aweme, "aweme");
        return this.LIZ.LJIILL(aweme, awemeRawAd, 12);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final PromoteIconFlipFrequencySettingsModel LJIILLIIL() {
        return this.LIZ.LJIILLIIL();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJIIZILJ() {
        this.LIZ.LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final String LJIJ(Aweme aweme) {
        return this.LIZ.LJIJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJIJI(String str, String str2, java.util.Map map) {
        this.LIZ.LJIJI(str, str2, map);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final String LJIJJ(Aweme aweme) {
        return this.LIZ.LJIJJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final long LJIJJLI() {
        return this.LIZ.LJIJJLI();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final PromoteEntrySchemaModel LJIL() {
        return this.LIZ.LJIL();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final int LJJ() {
        return this.LIZ.LJJ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final boolean LJJI() {
        return this.LIZ.LJJI();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJJIFFI(String schema) {
        o.LJIIIZ(schema, "schema");
        this.LIZ.LJJIFFI(schema);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJJII(Integer num, Long l, String str, String str2) {
        this.LIZ.LJJII(num, l, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJJIII() {
        this.LIZ.LJJIII();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void preload(Context context, String schema) {
        o.LJIIIZ(schema, "schema");
        o.LJIIIZ(context, "context");
        this.LIZ.preload(context, schema);
    }
}
