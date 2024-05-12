package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.model.BehaviorType;
import com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Y6a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86832Y6a {
    public final List<PublishBehaviorModel> LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final AbstractC86839Y6h LJI;

    public C86832Y6a(String publishId, List<PublishBehaviorModel> source) {
        PublishBehaviorModel publishBehaviorModel;
        PublishBehaviorModel publishBehaviorModel2;
        boolean z;
        PublishBehaviorModel publishBehaviorModel3;
        AbstractC86839Y6h LIZ;
        o.LJIIIZ(publishId, "publishId");
        o.LJIIIZ(source, "source");
        this.LIZ = source;
        Iterator<PublishBehaviorModel> it = source.iterator();
        while (true) {
            publishBehaviorModel = null;
            if (it.hasNext()) {
                publishBehaviorModel2 = it.next();
                if (o.LJ(publishBehaviorModel2.stage, "CP")) {
                    break;
                }
            } else {
                publishBehaviorModel2 = null;
                break;
            }
        }
        if (publishBehaviorModel2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.LIZIZ = z;
        boolean LJ = o.LJ(publishId, "-1");
        this.LIZJ = LJ;
        this.LIZLLL = o.LJ(publishId, "-2");
        this.LJ = ((PublishBehaviorModel) ORZ.LJLLJ(this.LIZ)).timeStamp;
        this.LJFF = ((PublishBehaviorModel) ORZ.LLFF(this.LIZ)).timeStamp;
        if (LJ) {
            LIZ = new C86841Y6j(((PublishBehaviorModel) ListProtector.get(this.LIZ, 0)).code, ((PublishBehaviorModel) ListProtector.get(this.LIZ, 0)).stage);
        } else if (!z) {
            LIZ = C86845Y6n.LIZIZ;
        } else {
            Iterator<PublishBehaviorModel> it2 = this.LIZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                PublishBehaviorModel next = it2.next();
                PublishBehaviorModel publishBehaviorModel4 = next;
                if (o.LJ(publishBehaviorModel4.stage, "CA") && publishBehaviorModel4.type == BehaviorType.SUCCESS) {
                    if (next != null) {
                        LIZ = C86844Y6m.LIZIZ;
                    }
                }
            }
            List<PublishBehaviorModel> list = this.LIZ;
            ListIterator<PublishBehaviorModel> listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    publishBehaviorModel3 = listIterator.previous();
                    if (publishBehaviorModel3.type == BehaviorType.FAILED) {
                        break;
                    }
                } else {
                    publishBehaviorModel3 = null;
                    break;
                }
            }
            PublishBehaviorModel publishBehaviorModel5 = publishBehaviorModel3;
            if (publishBehaviorModel5 != null) {
                if (o.LJ(publishBehaviorModel5.stage, "UP") && o.LJ(publishBehaviorModel5.code, "-39995")) {
                    Iterator<PublishBehaviorModel> it3 = this.LIZ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        PublishBehaviorModel next2 = it3.next();
                        PublishBehaviorModel publishBehaviorModel6 = next2;
                        if (o.LJ(publishBehaviorModel6.stage, "SN") && publishBehaviorModel6.type == BehaviorType.FAILED) {
                            publishBehaviorModel = next2;
                            break;
                        }
                    }
                    PublishBehaviorModel publishBehaviorModel7 = publishBehaviorModel;
                    if (publishBehaviorModel7 == null) {
                        LIZ = new C86842Y6k("CONFLICT");
                    } else {
                        LIZ = new C86841Y6j(publishBehaviorModel7.code, publishBehaviorModel7.stage);
                    }
                } else {
                    LIZ = new C86841Y6j(publishBehaviorModel5.code, publishBehaviorModel5.stage);
                }
            } else {
                LIZ = LIZ("SN", C86837Y6f.LJLIL);
                if (LIZ == null && (LIZ = LIZ("AK", C86838Y6g.LJLIL)) == null && (LIZ = LIZ("UP", C86835Y6d.LJLIL)) == null && (LIZ = LIZ("CA", C86836Y6e.LJLIL)) == null) {
                    LIZ = new C86842Y6k("UNKNOW");
                }
            }
        }
        this.LJI = LIZ;
    }

    public final C86843Y6l LIZ(String str, InterfaceC88472Yns<? super PublishBehaviorModel, Boolean> interfaceC88472Yns) {
        PublishBehaviorModel publishBehaviorModel;
        boolean z;
        BehaviorType behaviorType;
        Iterator<PublishBehaviorModel> it = this.LIZ.iterator();
        while (true) {
            if (it.hasNext()) {
                publishBehaviorModel = it.next();
                if (interfaceC88472Yns.invoke(publishBehaviorModel).booleanValue()) {
                    break;
                }
            } else {
                publishBehaviorModel = null;
                break;
            }
        }
        boolean z2 = false;
        if (publishBehaviorModel != null) {
            z = true;
        } else {
            z = false;
        }
        for (PublishBehaviorModel publishBehaviorModel2 : this.LIZ) {
            PublishBehaviorModel publishBehaviorModel3 = publishBehaviorModel2;
            if (o.LJ(publishBehaviorModel3.stage, str) && ((behaviorType = publishBehaviorModel3.type) == BehaviorType.SUCCESS || behaviorType == BehaviorType.FAILED)) {
                if (publishBehaviorModel2 != null) {
                    z2 = true;
                }
                if (z || z2) {
                    return null;
                }
                return new C86843Y6l(str);
            }
        }
        if (z) {
        }
        return null;
    }
}
