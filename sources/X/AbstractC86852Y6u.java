package X;

/* renamed from: X.Y6u, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC86852Y6u extends AbstractC37594EpC<InterfaceC86855Y6x, InterfaceC86851Y6t> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "29300"));

    @InterfaceC37838Et8(params = {"methodType", "startOrStopRecord", "playOrStopAudio", "manageVoiceType"}, results = {"vopState", "qualityResult", "vopTextState", "audioPlayProgress", "vopSpeakerInfo", "vopCode", "isBlueToothConnected", "recordStatus"})
    public final String LJLILLLLZI = "voiceCloningMethods";
    public final EnumC38004Evo LJLJI = EnumC38004Evo.PRIVATE;

    @Override // X.AbstractC37594EpC, X.InterfaceC37666EqM
    public final EnumC38004Evo getAccess() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC37666EqM
    public final String getName() {
        return this.LJLILLLLZI;
    }
}
