package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.5Hw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132485Hw extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public final /* synthetic */ NLESegmentVideo LJLIL;
    public final /* synthetic */ C5KH LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ Context LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ InterfaceC88472Yns<ArrayList<NLETrackSlot>, C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C132485Hw(NLESegmentVideo nLESegmentVideo, C5KH c5kh, int i, String str, Context context, boolean z, InterfaceC88472Yns<? super ArrayList<NLETrackSlot>, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.LJLIL = nLESegmentVideo;
        this.LJLILLLLZI = c5kh;
        this.LJLJI = i;
        this.LJLJJI = str;
        this.LJLJJL = context;
        this.LJLJJLL = z;
        this.LJLJL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        String path = str;
        o.LJIIIZ(path, "path");
        this.LJLIL.LJ().LJIIIZ(path);
        C5KH c5kh = this.LJLILLLLZI;
        int i = this.LJLJI;
        String str2 = this.LJLJJI;
        Context context = this.LJLJJL;
        boolean z = this.LJLJJLL;
        InterfaceC88472Yns<ArrayList<NLETrackSlot>, C76800UCe> interfaceC88472Yns = this.LJLJL;
        int i2 = i + 1;
        if (i2 < c5kh.LIZJ.size()) {
            c5kh.LIZ(i2, context, str2, interfaceC88472Yns, z);
        } else {
            interfaceC88472Yns.invoke(c5kh.LIZJ);
        }
        return C76800UCe.LIZ;
    }
}
