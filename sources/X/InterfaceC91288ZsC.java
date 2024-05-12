package X;

/* renamed from: X.ZsC, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public interface InterfaceC91288ZsC {
    boolean interceptPause(C91299ZsN c91299ZsN);

    boolean interceptPlay(C91299ZsN c91299ZsN, InterfaceC91296ZsK interfaceC91296ZsK);

    boolean interceptResume(C91299ZsN c91299ZsN);

    boolean interceptSeek(long j);

    boolean interceptSetStartPlayTime(int i);

    boolean interceptStop(C91299ZsN c91299ZsN);

    InterfaceC91296ZsK processPlayable(InterfaceC91296ZsK interfaceC91296ZsK);
}
