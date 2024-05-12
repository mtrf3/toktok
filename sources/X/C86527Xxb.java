package X;

/* renamed from: X.Xxb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86527Xxb implements C1X {
    public static final C86527Xxb LIZ = new C86527Xxb();

    @Override // X.C1X
    public final void LIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                C86478Xwo.LIZLLL("InnerPushManager", "[onLiveStatusChange], unknown status, change pure mode to false");
                C86500XxA.LJLJJL = false;
                return;
            } else {
                C86478Xwo.LIZLLL("InnerPushManager", "[onLiveStatusChange], enter live room");
                C86500XxA.LJLJJL = true;
                return;
            }
        }
        C86478Xwo.LIZLLL("InnerPushManager", "[onLiveStatusChange], quit live room");
        C86500XxA.LJLJJL = false;
        HandlerC86501XxB.LIZ.LJ(true);
    }
}
