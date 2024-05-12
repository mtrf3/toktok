package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ToJ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75759ToJ extends OFU {
    public final long LJLILLLLZI;
    public final long LJLJI;
    public final long LJLJJI;
    public final long LJLJJL;
    public final long LJLJJLL;
    public final Room LJLJL;
    public final java.util.Map<String, Object> LJLJLJ;
    public final List<String> LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75759ToJ(long j, long j2, long j3, long j4, long j5, Room room, java.util.Map map, String source, List sourceTrace) {
        super(sourceTrace);
        o.LJIIIZ(source, "source");
        o.LJIIIZ(sourceTrace, "sourceTrace");
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = j3;
        this.LJLJJL = j4;
        this.LJLJJLL = j5;
        this.LJLJL = room;
        this.LJLJLJ = map;
        this.LJLJLLL = sourceTrace;
    }

    public C75759ToJ(int i, long j, long j2, long j3, long j4, long j5, Room room, java.util.Map map, String str, List list, int i2) {
        this(j, j2, j3, (i2 & 16) != 0 ? 0L : j4, (i2 & 32) != 0 ? 0L : j5, (i2 & 64) != 0 ? null : room, (i2 & 128) == 0 ? map : null, (i2 & 256) != 0 ? "" : str, (i2 & 512) != 0 ? C61878OQg.INSTANCE : list);
    }
}
