package X;

import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import fjb.a;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoCutter$1$getVFileInfoTask$1", f = "CutOptimizedVideoCutter.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.EFn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36119EFn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C46069I6f LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36119EFn(C46069I6f c46069I6f, InterfaceC67352kd<? super C36119EFn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c46069I6f;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36119EFn(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        List<MultiEditVideoSegmentRecordData> list = this.LJLIL.LIZLLL().segmentDataList;
        o.LJIIIIZZ(list, "curRecordData.segmentDataList");
        C46069I6f c46069I6f = this.LJLIL;
        int i = 0;
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
            int i2 = i + 1;
            if (i >= 0) {
                String str = multiEditVideoSegmentRecordData.videoPath;
                o.LJIIIIZZ(str, "item.videoPath");
                if (((LinkedHashMap) c46069I6f.LIZJ).get(str) == null) {
                    String LLILLIZIL = c46069I6f.LIZ.LLILLIZIL(0, 0, i, str);
                    if (LLILLIZIL == null) {
                        LLILLIZIL = "";
                    }
                    c46069I6f.LIZJ.put(str, LLILLIZIL);
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
